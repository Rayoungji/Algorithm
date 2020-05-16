package beakjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11054_가장긴바이토닉부분수열 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int arr[]=new int[n+1];
        int Ldp[]=new int[n+1];
        int Rdp[]=new int[n+1];

        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        Ldp[0]=1;
        Rdp[0]=1;

        for(int i=1; i<n; i++){
            int max=Ldp[i];
            for(int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]){
                    max=Math.max(max,Ldp[j]);
                }
            }
            Ldp[i]=max+1;
        }

        for(int i=n-1; i>=1; i--){
            int max=Rdp[i];
            for(int j=i-1; j<n; j++){
                if(arr[i]>arr[j]){
                    max=Math.max(max,Rdp[j]);
                }
            }
            Rdp[i]=max+1;
        }

        int answer=Ldp[0]+Rdp[0]-1;
        for(int i=1; i<n; i++){
            answer=Math.max(answer,(Ldp[i]+Rdp[i]-1));
        }
        System.out.println(answer);
    }
}
