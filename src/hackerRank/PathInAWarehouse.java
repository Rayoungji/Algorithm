package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class PathInAWarehouse {
    public static void main(String args[]){

    }
    public static int numPaths(List<List<Integer>> warehouse) {

        if(warehouse.get(0).get(0) == 0) return 0;

        int m = warehouse.size(); //행
        int n = warehouse.get(0).size();  //열

        int[][] dp = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(warehouse.get(i).get(j) == 0) dp[i][j] = -1;
            }
        }
        dp[0][0] = 1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                if(i!=0)    dp[i][j]+=dp[i-1][j]%1000000007;
                if(j!=0)    dp[i][j]+=dp[i][j-1]%1000000007;
            }
        }

        return dp[m-1][n-1]%1000000007;
    }
}
