package Programmers.binarysearch;

public class PG_예산 {
    public static void main(String args[]){

    }
    public static int solution(int[] budgets, int M) {
        int answer = 0;
        int left = 0;
        int right = 0;
        for (int budget : budgets) {
            if (budget > right) {
                right = budget;
// answer의 최대 값은 budgets의 요소의 최대값
            }
        }
        int middle = 0;
        while (left <= right) {
            long sum = 0;
            middle = (left + right) / 2;
            for (int budget : budgets) {
                if (budget >= middle) {
                    sum += middle;
                }
                else {
                    sum += budget;
                }
            }
            if (sum > M) {
                right = middle - 1;
            }
            else {
// answer에 의한 예산의 합은 예산 M보다 작아야 하므로 해당 분기에서 처리
                answer = middle;
                left = middle + 1;
            }
        }
        return answer;
    }
}
