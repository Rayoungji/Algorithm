package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11055_가장큰증가부분수열 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        long num[] = new long[n + 1];
        long dp[] = new long[n + 1];
        long x = 0;
        for (int i = 0; i < n; i++) {
            num[i] = Long.parseLong(str[i]);
        }

        dp[0]=num[0];
        for (int i = 1; i < n; i++) {
            x = dp[i];
            for (int j = i - 1; j >= 0; j--) {
                if (num[i] > num[j]) {
                    x = Math.max(x, dp[j]);
                }
            }
            dp[i] = x + num[i];
        }

        long answer = dp[0];
        for (int i = 1; i < n; i++) {
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
