package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9465_스티커 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
           int n=Integer.parseInt(br.readLine());
           String str[]=br.readLine().split(" ");
           String str2[]=br.readLine().split(" ");
           int card[][]=new int[2][n+1];
           int dp[][]=new int[2][n+1];
           for(int j=0; j<n; j++){
               card[0][j]=Integer.parseInt(str[j]);
               card[1][j]=Integer.parseInt(str2[j]);
           }
           dp[0][0]=card[0][0];
           dp[1][0]=card[1][0];
           dp[0][1]=card[1][0]+card[0][1];
           dp[1][1]=card[0][0]+card[1][1];

           for(int l=2; l<n; l++){
               dp[0][l]=Math.max(dp[1][l-1],dp[1][l-2])+card[0][l];
               dp[1][l]=Math.max(dp[0][l-1],dp[0][l-2])+card[1][l];
           }
           int answer=Math.max(dp[0][n-1],dp[1][n-1]);
           System.out.println(answer);
        }
    }
}
