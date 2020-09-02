package beakjun.sort;
/*
정의 : 인접한 두 숫자를 비교하며 큰값을 뒤로 보내어 정렬하는 방식
방식 : 탐색정렬의 첫 배열과 다음배열을 비교하며 큰 숫자를 뒤로 보낸다 (스위치) 이렇게 되면 탐색이 끝났을 때 가장 큰 숫자는 맨뒤에 오게됌
맨 뒷 숫자를 제외한 앞의 숫자들을 탐색하여 위를 반복한다
특징 : 선택정렬와 같은 시간복잡도를 가지고 있지만 버블정렬은 매 탐색마다 스위치를 하므로 효율성이 더 떨어진다 (선택 정렬은 최소값 찾으면 한번만 스위치 함)
시간복잡도 : O(n^2)
* */
public class 버블정렬_1 {
    public static void main(String args[]) {
        int sort[] = {3, 6, 2, 1, 5, 9, 10, 8, 4, 7};
        int temp;

        for(int i=0; i<sort.length; i++){
            for(int j=0; j<9-i; j++){
                if(sort[j]>sort[j+1]){
                    temp = sort[j];
                    sort[j]=sort[j+1];
                    sort[j+1]=temp;
                }
            }
        }
        for(int i=0; i<sort.length; i++){
            System.out.println(sort[i]);
        }
    }
}
