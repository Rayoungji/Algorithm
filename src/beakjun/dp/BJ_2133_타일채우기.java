package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*참고자료: https://mizzo-dev.tistory.com/entry/baekjoon2133*/

public class BJ_2133_타일채우기 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n + 1];

        dp[1] = 0;  // 1<=n<=30 이므로
        if (n > 1) {  //n=1인 경우 배열 인덱스 오류 방지
            dp[2] = 3;
        }

        for (int i = 4; i <= n; i += 2) {
            dp[i] += dp[2] * dp[i - 2];
            for (int j = i - 4; j >= 2; j -= 2) {
                dp[i] += dp[j] * 2;  //이전까지의 dp 특수값(2개)

            }

            dp[i] += 2;  //새로운 특수 값
        }
        System.out.println(dp[n]);
    }
}
