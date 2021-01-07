package Programmers.level1;

import java.util.Arrays;

public class PG_제일_작은수_제거 {
    public static void main(String args[]){
        int[] ints = {4,3,2,1};
        System.out.println(Arrays.toString(solution2(ints)));
    }
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] copy = new int[arr.length];
            int cindex = 0;
            for (int i : arr) {
                copy[cindex] = i;
                cindex++;
            }
            Arrays.sort(copy);
            int[] answer = new int[arr.length - 1];
            int index = 0;
            for (int i : arr) {
                if (i != copy[0]) {
                    answer[index] = i;
                    index++;
                }
            }
            return answer;
        }
    }

    //스트림 사용하기 !!!!!!!!
    public static int[] solution2(int[] arr) {
     if (arr.length==1){return new int[]{-1};}
     int min = Arrays.stream(arr).min().getAsInt();
     return Arrays.stream(arr).filter(i -> i!=min).toArray();
    }
}
