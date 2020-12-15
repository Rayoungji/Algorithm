package Programmers.level1;


import java.util.ArrayList;
import java.util.List;

public class PG_같은_숫자는_싫어 {
    public static void main(String args[]){
        int arr[] = {4,4,4,3,3};
        int answer[] = solution(arr);
        for (int i : answer) {
            System.out.println(i);
        }
    }
    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
       list.add(arr[0]);
       for (int i : arr) {
           if (list.get(list.size()-1) != i) {
               list.add(i);
           }
       }
       int answer[] = new int[list.size()];
       int count = 0;
       for (int i : list) {
           answer[count] = i;
           count++;
       }

        return answer;
    }
}
