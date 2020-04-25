package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2225_합분해 {

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int dp[][] = new int[k + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= k; i++) {
            for (int l = 0; l <= n; l++) {
                for (int j = 0; j <= l; j++) {
                    dp[i][l] += dp[i - 1][j];
                    dp[i][l] %= 1000000000;
                }
            }
        }
        System.out.println(dp[k][n]);
    }

}
