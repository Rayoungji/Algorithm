package Programmers.level1;

public class PG_두_정수_사이의_합 {
    public static void main(String args[]) {
        System.out.println(solution(5,5));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        return answer;
    }
}
