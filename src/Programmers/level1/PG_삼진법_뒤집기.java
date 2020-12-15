package Programmers.level1;


import java.util.ArrayList;
import java.util.List;

public class PG_삼진법_뒤집기 {
    public static void main(String args[]){
        System.out.println(solution(125));
    }
    public static int solution(int n) {
        List<Integer> list = new ArrayList<>();

        //3진법 변환 후 뒤집기
        while (n > 0) {
            list.add(n%3);
            n = n/3;
        }

        int answer = 0;
        int revers = 0;
        //10진법으로 변환
        while (!list.isEmpty()) {
            answer += list.remove(list.size()-1)*Math.pow(3,revers);
            revers++;
        }
        return answer;
    }
}
