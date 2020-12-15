package Programmers.level1;

import java.util.*;

public class PG_문자열_내_마음대로_정렬하기 {
    public static void main(String args[]){
        String []strings = {"sun", "bed", "car"};
        String answer[] = solution(strings,1);
        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n))
                    return 1;
                else if (o1.charAt(n) == o2.charAt(n))
                    return o1.compareTo(o2);
                else
                    return -1;
            }
        });
        return strings;
    }
}
