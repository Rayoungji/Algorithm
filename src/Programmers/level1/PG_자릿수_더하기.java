package Programmers.level1;

public class PG_자릿수_더하기 {
    public static void main(String args[]){
        System.out.println(solution(987));
        System.out.println(solution2(987));
    }
    public static int solution(int n) {
        int answer = 0;

        String s =String.valueOf(n);

        for (int i=0; i<s.length(); i++){
            answer +=Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return answer;
    }
    public static int solution2(int n) {
        int answer = 0;

        while(n>0) {
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}
