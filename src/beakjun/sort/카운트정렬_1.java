package beakjun.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 카운트정렬_1 {
    public static void main(String args[]) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[10001]; //숫자의 범위

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            //해당 인덱스의 값을 1 증
            cnt[Integer.parseInt(br.readLine())] ++;
        }
        for (int i=1; i<10001; i++){
            while (cnt[i]>0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
    }
