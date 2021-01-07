package Programmers.level1;


import java.util.Arrays;

public class PG_자연수_뒤집어_배열만들기 {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(solution2(12345)));
    }
    public static int[] solution(long n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int[] answer = new int[chars.length];
        int index = chars.length-1;
        for (char i : chars) {
            answer[index]=Integer.parseInt(String.valueOf(i));
            index--;
        }
        return answer;
    }
    public static int[] solution2(long n) {
        String s = String.valueOf(n);
        int answer[] = new int[s.length()];
        for (int i=0; i<answer.length; i++){
            answer[i] = (int)n%10;
            n=n/10;
        }
        return answer;
    }
}
