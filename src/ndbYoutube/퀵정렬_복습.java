package ndbYoutube;

import java.util.Arrays;

public class 퀵정렬_복습 {
    public static void main(String args[]) {
        int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
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
