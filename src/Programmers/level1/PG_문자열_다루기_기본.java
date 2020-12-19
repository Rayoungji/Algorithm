package Programmers.level1;

public class PG_문자열_다루기_기본 {
    public static void main(String args[]){
        System.out.println(solution("a234"));
    }
    public static boolean solution(String s) {
        if (s.length()==4 || s.length()==6) {
            for (int i=0; i<s.length(); i++){
                if (!(s.charAt(i)>='0' && s.charAt(i)<='9')) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
