package Programmers.greedy;

public class PG_기지국설치 {
    public static void main(String args[]) {
        int[] n = {9};
        System.out.println(solution(16, n, 2));
    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int apt = 1;
        int index = 0;
        int end = 0;
        while (apt <= n) {
            if (index < stations.length && apt >= stations[index] - w) {
                end = stations[index] + w;
                apt = end + 1;
                index += 1;
            } else {
                answer += 1;
                apt += w * 2 + 1;
            }
        }
        return answer;
    }
}