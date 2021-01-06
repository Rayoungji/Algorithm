package Programmers.level1;

public class PG_이상한_문자_만들기 {
    public static void main(String args[]) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (char i : chars) {
            if (i == ' ') {
                index = 0;
                stringBuilder.append(' ');
            } else {
                if (index % 2 == 0) {
                    stringBuilder.append(Character.toUpperCase(i));
                } else {
                    stringBuilder.append(Character.toLowerCase(i));
                }
                index++;
            }
        }
        return stringBuilder.toString();
    }
}
