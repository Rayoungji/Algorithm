package Programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PG_문자열_내림차순으로_정렬하기 {
    public static void main(String args[]){
        String s = "Zbcdefg";
        System.out.println(solution(s));
        System.out.println(solution2(s));
    }

    public static String solution(String s) {
        Character []chars = new Character[s.length()];
        for (int i=0; i<s.length(); i++){
            chars[i]=s.charAt(i);
        }
        Arrays.sort(chars, Collections.reverseOrder());
        String answer = "";
        for (Character c : chars){
            answer+=c;
        }
        return answer;
    }

    public static String solution2(String s) {
        return Stream.of(s.split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
    }
}
