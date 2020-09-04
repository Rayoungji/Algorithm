package beakjun.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_10989_수정렬하기3 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int arrayList[] = new int[n];
        for (int i = 0; i < n; i++) {
            arrayList[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arrayList);
        for(int i : arrayList){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
