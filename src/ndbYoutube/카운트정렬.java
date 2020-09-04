package ndbYoutube;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
정의 : 숫자의 크기를 기준으로 정렬하는 방식
원리 : 입력 가능한 숫자의 크기+1 만큼의 배열을 생성 후 숫자를 인덱스로하여 입력을 받으며 해당 인텍스의 배열의 크기를 1씩 증가시킨다
배열을 순차적으로 돌며 0보다 큰 경우에 출력을하는 방식 (개인적으로 매우 직관적)
특징 : 기존의 정렬은 자리배치를 바꾸는 형식이었지만 이 방식은 그렇지 않음
시간복잡도 : for문 1개 - O(n) 대박이쥬?
* */
public class 카운트정렬 {
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
