package beakjun.sort;
/*
- 가장 일반적으로 생각하는 정렬 -
정의 : 루프를 돌며 가장 작은 값을 찾아 탐색정렬의 첫 배열과 스위치 하여준다 (작은 값 찾아 앞에 정렬하는 방식)
특징 : 탐색하는 정렬의 크기를 줄여가며 가장 작은 값을 찾아 탐색하는 정렬의 첫 배열에 저장
시간복잡도 : O(n^2)
* */
public class 선택정렬_1 {
    public static void main(String args[]) {
        int sort[] = {3, 6, 2, 1, 5, 9, 10, 8, 4, 7};
        int min, temp, index;
        for (int i = 0; i < sort.length; i++) {
            min = sort[i];
            temp = sort[i];
            index = i;
            for (int j = i; j < sort.length; j++) {
                if (min > sort[j]) {
                    min = sort[j];
                    index = j;
                }
            }
            sort[i] = sort[index];
            sort[index] = temp;
        }
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]+" ");

        }
    }
}
