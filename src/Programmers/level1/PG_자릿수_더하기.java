package Programmers.level1;

public class PG_자릿수_더하기 {
    public static void main(String args[]){
        System.out.println(solution(987));
    }
    public static int solution(int n) {
        int answer = 0;

        String s =String.valueOf(n);

        for (int i=0; i<s.length(); i++){
            answer +=Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return answer;
    }
}
