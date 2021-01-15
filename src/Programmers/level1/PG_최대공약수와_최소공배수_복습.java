package Programmers.level1;

import java.util.Arrays;

public class PG_최대공약수와_최소공배수_복습 {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(solution(3, 12)));
    }

    public static int[] solution(int n, int m) {
        int gcd = gcd(Math.max(n,m),Math.min(n,m));
        //두 수의 최소공배수는 두수 곱한 후 최대공약수로 나눈 값
      return new int[] {gcd, (n*m)/gcd};
    }

    //유클리드 호제법을 이용한 최대공약수 구하기
    public static int gcd(int big, int small) {
        return big%small !=0 ? gcd(small,big%small) : small;
    }
}
