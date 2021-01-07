package Programmers.level1;


import java.util.Arrays;
import java.util.Collections;

public class PG_정수_내림차순 {
    public static void main(String args[]){
        System.out.println(solution(12332));
    }
    public static long solution(long n) {
        String s = String.valueOf(n);
        Character[] chars = new Character[s.length()];
        for (int i=0; i<s.length(); i++){
            chars[i]= Character.valueOf(s.charAt(i));
        }
        Arrays.sort(chars, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Character i : chars) {
            sb.append(i);
        }
        return Long.parseLong(sb.toString());
    }
}
