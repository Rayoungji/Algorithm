package Programmers.level1;

import java.util.Arrays;

public class PG_X만큼_간격이_있는_n개의숫자 {
    public static void main(String args[]){
        System.out.println(Arrays.toString(solution(-4,3)));
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}
