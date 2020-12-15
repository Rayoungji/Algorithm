package Programmers.level1;

public class PG_가운데_글자_가져오기 {

    public static void main(String args[]){
        String s = "qwer";
        System.out.println(solution(s));
    }

    public static String solution(String s) {

        String answer = "";
        char []chars = s.toCharArray();

        if (s.length()%2 == 0) {
            answer += chars[s.length()/2-1];
            answer += chars[s.length()/2];
        } else {
            answer += chars[s.length()/2];
        }
        return answer;
    }

}
