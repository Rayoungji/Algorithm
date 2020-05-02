package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11057_오르막수 {
    static final int num=10007;
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[][] = new int[n + 1][10];

        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0]=1;
            for (int j = 1; j <= 9; j++) {
                dp[i][j]=(dp[i][j-1]+dp[i-1][j])%num;
            }
        }
        int answer=0;
        for(int i=0; i<=9; i++){
            answer+=dp[n][i];
        }
        System.out.println(answer%num);
    }
}
