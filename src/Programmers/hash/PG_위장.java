package Programmers.hash;

import java.util.HashMap;
import java.util.Map;
/*경우의수 - 무족권 곱하기 !! 근데 문제에 맞게 생각하기*/
public class PG_위장 {
    public static void main(String args[]){
        String[][] cloths = new String[3][2];
        cloths[0][0]="yellow_hat";
        cloths[0][1]="head";
        cloths[1][0]="blue_sunglasses";
        cloths[1][1]="eyes";
        cloths[2][0]="green_turban";
        cloths[2][1]="head";

        int a = solution(cloths);
        System.out.println(a);
    }
    public static int solution(String[][] clothes) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])) {
                map.replace(clothes[i][1],map.get(clothes[i][1])+1);
            } else {
                map.put(clothes[i][1],1);
            }
        }
        int answer = 1;
        for(Integer value : map.values()) {
            answer*=(value+1);
        }
        return answer-1;
    }
}
