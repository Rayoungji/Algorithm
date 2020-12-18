package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PG_나누어_떨어지는_숫자_배열 {
    public static void main(String args[]) {
        int array[] = {5, 9, 7, 10};
        System.out.println(Arrays.toString(solution(array, 5)));
        System.out.println(Arrays.toString(solutionByStream(array,5)));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        Collections.sort(list);
        if (list.isEmpty()) {
            int answer2[] = new int[1];
            answer2[0] = -1;
            return answer2;
        } else {
            int answer[] = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }

    public static int[] solutionByStream(int[] arr, int divisor) {
       return Arrays.stream(arr).filter(i -> i%divisor ==0 ).toArray();
    }
}
