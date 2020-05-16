package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11722_가장큰감소부분수열 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int num[]=new int[n+1];
        int dp[]=new int[n+1];  //dp[n]=n으로 끝나는 가장 긴 감소부분수열의 길이

        for(int i=0; i<n; i++){
            num[i]=Integer.parseInt(str[i]);
        }

        dp[0]=1;

        for(int i=1; i<n; i++){
            int max=dp[i];
            for(int j=i-1; j>=0; j--){
                if(num[i]<num[j]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
        }
        int answer=dp[0];
        for(int i=1; i<n; i++){
            answer=Math.max(answer,dp[i]);
        }
        System.out.println(answer);
    }
}
