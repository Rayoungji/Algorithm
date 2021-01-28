package Programmers.binarysearch;

import java.util.Arrays;

public class PG_예산 {
    public static void main(String args[]) {
        int budgets[] = {120, 110, 140, 150};
        System.out.println(solution(budgets, 485));
    }

    public static int solution(int[] budgets, int M) {
        int min = 0;
        int max = Arrays.stream(budgets).max().getAsInt();
        int answer = 0;
        while (min <= max) {
            int mid = (min + max) / 2;
            int sum = 0;
            for (int b : budgets) {
                if (b > mid) {
                    sum += mid;
                } else {
                    sum += b;
                }
            }
            if (sum <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }
        return answer;
    }
}
