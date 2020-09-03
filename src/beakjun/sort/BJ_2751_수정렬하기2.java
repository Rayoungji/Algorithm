package beakjun.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BJ_2751_수정렬하기2 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> numberList = new ArrayList<>();
        int []m = new int[n];

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            numberList.add(num);
            m[i]=num;

        }

        Collections.sort(numberList);
        Arrays.sort(m);

        for(int i : numberList){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int j : m){
            System.out.print(j+" ");
        }
    }
}
