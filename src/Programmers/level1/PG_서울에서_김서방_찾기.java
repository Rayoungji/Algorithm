package Programmers.level1;

import java.util.Arrays;

public class PG_서울에서_김서방_찾기 {
    public static void main(String args[]){
        String seoul[] = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
    public static String solution(String[] seoul) {
        int index = 0;
        for (int i=0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")){
                index = i;
            }
        }
        return "김서방은 "+index+"에 있다";
    }
}
