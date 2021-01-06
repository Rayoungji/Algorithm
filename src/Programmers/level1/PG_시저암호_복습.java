package Programmers.level1;


public class PG_시저암호_복습 {
    public static void main(String args[]) {
        System.out.println(solution("a a a", 3));
    }

    public static String solution(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char i : chars) {
            if (Character.isLowerCase(i)) {
                char an = i + n > 'z' ? (char) ('a' + (i + n - 'z' - 1)) : (char) (i + n);
                stringBuilder.append(an);
            } else if (Character.isUpperCase(i)) {
                char an = i + n > 'Z' ? (char) ('A' + (i + n - 'Z' - 1)) : (char) (i + n);
                stringBuilder.append(an);
            } else {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}