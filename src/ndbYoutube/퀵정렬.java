package ndbYoutube;

import java.util.Arrays;
/*참고 블로그: https://limkydev.tistory.com/145
정의 : 피봇 숫자를 잡고 피봇 숫자의 왼쪽은 피봇보다 작은값 오른쪽은 비폿보다 큰 값으로 정렬한다
원리 : 큰값을 찾는 인덱스가 작은값을 찾는 인덱스보다 커졌을 때 즉 비봇의 인덱스를 넘어갔을 때는 작은값 정렬이 완료된 것이므로 while문 탈출
큰값을 찾는 인덱스가 배열의 첫 숫자 인덱스보다 클 경우(안하면 무한 재귀호출 발생) 다시 퀵정렬 시작 (재귀 호출 !!)
이러다보면 큰값을 찾는 인덱스가 배열의 첫 인덱스가 되었을 때 모든 값들은 올바르게 정렬되어진다
시간복잡도 : O(n log n)*/
public class 퀵정렬 {

    public static void main(String[] args) {
        int data[] = { 3, 6, 2, 1, 5, 9, 10, 8, 4, 7 };

        sort(data, 0, data.length - 1);

        System.out.println(Arrays.toString(data));

    }

    public static void sort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2]; // pivot 가운데 설정 (최악의 경우 방지)
        System.out.println(pivot);

        while (left <= right) {
            while (data[left] < pivot)
                left++;
            while (data[right] > pivot)
                right--;

            if (left <= right) {
                System.out.println("change");
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
            System.out.println("left : " + left + " right : " + right);
        }

        if (l < right) {//분할정복시 더 이상 분할 것이 없는 경우 체크 (왼쪽 분할할 수 있는지 체크)
            System.out.println("l : " + l + " end: " + right);
            sort(data, l, right);
        }
        if (r > left) {//분할정복시 더 이상 분할 것이 없는 경우 체크 (오른쪽 분할할 수 있는지 체크)
            System.out.println("l : " + left + " end: " + r);
            sort(data, left, r);

        }
    }

}
