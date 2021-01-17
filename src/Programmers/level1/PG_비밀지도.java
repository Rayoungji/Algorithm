package Programmers.level1;

import java.util.Arrays;

public class PG_비밀지도 {
    public static void main(String args[]) {
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution2(6, arr1, arr2)));
        System.out.println(Arrays.toString(solution(6, arr1, arr2)));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String a = makeNum(Integer.toBinaryString(arr1[i]), n);
            String b = makeNum(Integer.toBinaryString(arr2[i]), n);
            String ans="";
            for (int j = 0; j < n; j++) {
                if (a.charAt(j) == '1' || b.charAt(j) == '1') {
                    ans += "#";
                } else {
                    ans += " ";
                }
            }
            answer[i] = ans;
        }
        return answer;
    }
    public static String makeNum(String a,int n) {
        String answer = "";
        for (int i=0; i<n-a.length(); i++){
            answer+=" ";
        }
        return answer+a;
    }

    //비트연산자 활용하기
    public static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];
        for (int i=0; i<map.length; i++){
            map[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        int index = 0;
        for (String i : map) {
            i = String.format("%"+n+"s",i);
            i = i.replace("1","#");
            i = i.replace("0"," ");
            map[index] = i;
            index++;
        }
        return map;
    }
}
