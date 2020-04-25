package Programmers.sort;

import java.util.*;

public class K번쨰수 {

    public static void main(String arg[]) {

        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        System.out.println(solution(array, commands));

    }

    public static int[] solution(int[] array, int[][] commands) {
        int start = 0;
        int end = 0;
        int k = 0;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            start = commands[i][0];
            end = commands[i][1];
            k = commands[i][2];
            for (int j = start - 1; j <= end - 1; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(k - 1);
        }
        return answer;
    }

}

