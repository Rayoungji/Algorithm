package beakjun.sort;
/*
정의 : 특정 숫자를 기준으로 이미 정렬되어있다고 가정하는 왼쪽의 정렬에 적절한 위치에 숫자를 삽입하는 방식
방식 : 첫 숫자는 넘어감(왼쪽에 숫자없음) 두번째 숫자부터 자신의 앞 숫자들과 비교하며 적절한 자리를 찾아 스위치
이때 왼쪽 숫자들은 이미 정렬된 상태므로 비교하며 정렬할 때 자신의 앞 숫자가 자신보다 작다면 더이상 작업을 안해도됌(시간 단축)
특징 : 선택정렬과 버블 정렬은 작업을 할 수록 탐색범위가 줄어드는 반면 삽입 정렬은 탐색범위가 점점 늘어남
시간복잡도 : O(n^2)
* */
public class 삽입정렬_1 {
    public static void main(String args[]) {
        int arr[] = {3, 6, 2, 1, 5, 9, 10, 8, 4, 7};
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

