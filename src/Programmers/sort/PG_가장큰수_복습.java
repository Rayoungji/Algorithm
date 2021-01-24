package Programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class PG_가장큰수_복습 {
    public static void main(String args[]) {
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {
        String answer = "";
        String str[] = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(str[0].equals("0")) {
            return "0";
        }

        for (String a : str) {
            answer += a;
        }
        return answer;
    }
    /*
    * String의 compateTo는 문자열의 첫번째 문자부터 아스키코드 값으로 비교하여 정렬한다.
    * 3,30의 경우 330이 아닌 303을 리턴함으로 Compatator도 사용해야 한다
    * */
}
