package Programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PG_K번째수_복습 {
    public static void main(String args[]) {
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int command[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, command)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int answer[] = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            List<Integer> list = new ArrayList<>();
            for (int j = start; j <= end; j++) {
                list.add(array[j]);
            }
            //Collections.sort(list);
            int tempArray[] = new int[list.size()];
            int count = 0;
            for (int z : list) {
                tempArray[count] = z;
                count++;
            }
            sort(tempArray, 0, tempArray.length - 1);
            answer[i] = tempArray[commands[i][2] - 1];
        }

        return answer;
    }

    public static void sort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];

        while (left <= right) {
            while (data[left] < pivot) {
                left++;
            }
            while (data[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }

        if (l < right) {
            sort(data, l, right);
        }
        if (r > left) {
            sort(data, left, r);
        }
    }
}
