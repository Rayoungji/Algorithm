package Programmers.level1;

public class PG_콜라츠_추측 {
    public static void main(String args[]) {
        System.out.println(solution(6));
    }

    public static int solution(int num) {
        int answer = 0;
        int max = 500;
        long num2 = num;
        while (answer < max && num2 != 1) {
            if (num2 % 2 == 0) {
                num2 = num2 / 2;
            } else {
                num2 = (num2 * 3) + 1;
            }
            answer++;
        }
        if (answer == max) {
            return -1;
        } else {
            return answer;
        }
    }
}
