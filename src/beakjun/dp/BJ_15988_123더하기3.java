package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_15988_123더하기3 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long dp[]=new long[1000001];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            for (int j = 4; j <= t; j++) {
                dp[j]=(dp[j-1]+dp[j-2]+dp[j-3])%1000000009;
            }
            System.out.println(dp[t]);
        }
    }
}
