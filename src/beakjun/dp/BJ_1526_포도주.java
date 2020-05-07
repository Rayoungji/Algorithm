package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
n에 대하여 범위를 생각하기 : 1인경우 dp[2],dp[3]은 배열의 범위를 벗어나기때문!!
i값보다 작은 애들 중에서 dp[n-2] 혹은 dp[n-3]들을 모두 비교해서 값 구하기 혹은 00x인경우를 포함하기 Math.max(1,Math.max(2,3))이런식으로 세개 비교하기!!
참고자료: https://zoonvivor.tistory.com/133
max,max2로 다시 해보긔
* */

public class BJ_1526_포도주 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if (n >= 1) {
            dp[0] = arr[0];
        }
        if (n >= 2) {
            dp[1] = arr[0] + arr[1];
        }
        if (n >= 3) {
            dp[2] = Math.max(dp[1], Math.max(arr[2] + arr[1], arr[2] + dp[0]));
        }

        for (int i = 3; i < n; i++) {

            dp[i] = Math.max(dp[i - 1], Math.max(arr[i] + arr[i - 1] + dp[i - 3], arr[i] + dp[i - 2]));
        }
        System.out.println(dp[n - 1]);
    }
}
