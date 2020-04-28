package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1149_RGB거리 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int list[][] = new int[n + 1][4];
        long dp[][] = new long[n + 1][4];

        for (int i = 1; i <= n; i++) {
            String str[] = br.readLine().split(" ");
            list[i][0] = Integer.parseInt(str[0]);
            list[i][1] = Integer.parseInt(str[1]);
            list[i][2] = Integer.parseInt(str[2]);
        }

        dp[1][0] = list[1][0];
        dp[1][1] = list[1][1];
        dp[1][2] = list[1][2];

        for (int i = 2; i <=n; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + list[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + list[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + list[i][2];
        }

        long answer = dp[n][0];
        for (int i = 1; i <= 2; i++) {
            answer = Math.min(answer, dp[n][i]);
        }
        System.out.println(answer);
    }
}
