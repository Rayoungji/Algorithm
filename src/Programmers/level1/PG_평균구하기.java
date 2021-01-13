package Programmers.level1;

public class PG_평균구하기 {
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }
    public static double solution(int[] arr) {
        int answer = 0;
        for (int i : arr) {
            answer +=i;
        }

        return answer/(double)arr.length;
    }
}
