package Programmers.level1;


public class PG_시저암호_복습 {
    public static void main(String args[]) {

        System.out.println(solution("xxXy",23));
        System.out.println((int)'x' + 23);
        System.out.println((int)'z');
        System.out.println((int)'Z');

    }
    public static String solution(String s, int n) {
        char[] array = s.toCharArray();
        String answer ="";
        for (char i : array) {
            if (i==' ') {
                answer+=" ";
            }
            else if((int)i+n < (int)'Z' || (int)i+n <(int)'z') {
                answer +=String.valueOf((char)((int)i + n));
            }
            else if ((int)i == (int)'z') {
                char a = 'a';
                answer += (String.valueOf((char)((int)a+n-1)));

            }
            else if ((int)i == (int)'Z') {
                char A = 'A';
                answer += (String.valueOf((char)((int)A+n-1)));
            }
            else if ((int)i+n > (int)'Z') {
                answer += (String.valueOf((char)((int)'A' + ((int)'Z' - (int)i -1))));
            }
            else if ((int)i+n > (int)'z') {
                answer += (String.valueOf((char)((int)'a' + ((int)'z' - (int)i -1))));
            }
        }
        return answer;
    }
}