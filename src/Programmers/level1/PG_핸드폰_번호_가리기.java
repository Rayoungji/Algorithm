package Programmers.level1;

public class PG_핸드폰_번호_가리기 {
    public static void main(String args[]){
        System.out.println(solution("027778888"));
    }
    public static String solution(String phone_number) {
        char[] chars = phone_number.toCharArray();
        int index = chars.length - 4;
        int cnt = 0;
        for (char i : chars) {
            if (cnt < index) {
                chars[cnt] = '*';
                cnt++;
            }
        }
        return String.valueOf(chars);
    }
}
