package beakjun.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ_2751_수정렬하기2 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> m = new ArrayList<>();

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            m.add(num);

        }
        Collections.sort(m);
        for (int j : m){
            System.out.println(j);
        }
    }
}
