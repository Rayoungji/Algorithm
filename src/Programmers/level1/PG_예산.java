package Programmers.level1;

import java.util.Arrays;

public class PG_예산 {
    public static void main(String args[]) {
        int[] d = {1, 3, 2, 5, 4};
        System.out.println(solution(d, 9));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            if (budget >= i) {
                budget = budget - i;
                answer++;
            }
        }

        return answer;
    }
}
