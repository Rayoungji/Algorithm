package codingTest.zum;

public class ex1 {

    public static long solution(long n) {
        long answer = 0;
        for (int i=1; i<n; i++) {
            answer += (i*n) + i;
        }
        return answer;
    }
}
