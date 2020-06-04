package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1309_동물원_복습 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n+1];

        dp[1]=3%9901;
        if(n>1){
            dp[2]=7%9901;
        }

        for(int i=3; i<=n; i++){
            dp[i]=(dp[i-1]*2+dp[i-2])%9901;
        }

        System.out.println(dp[n]);
    }
}
