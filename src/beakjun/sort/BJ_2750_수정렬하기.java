package beakjun.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2750_수정렬하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] data = new int[n];
        int i;
        for(i=0; i<n; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }

        quick_sort(data, 0, n-1);

        for(i=0; i<n; i++) {
            System.out.println(data[i]);
        }

    }

    private static void quick_sort(int[] data, int start, int end) {
        if(start >= end) return;

        int pivot = start;
        int l = pivot +1;
        int r = end;
        int temp;

        while(l <= r) {
            while(l <= end && data[l] <= data[pivot]) l++;
            while(r >= start+1 && data[r] >= data[pivot]) r--;

            if(l<r) {
                temp = data[l];
                data[l] = data[r];
                data[r] = temp;
            }else {
                temp = data[r];
                data[r] = data[pivot];
                data[pivot] = temp;
            }
        }

        quick_sort(data, start, r-1);
        quick_sort(data, r+1, end);
    }
}
