package Programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class PG_가장큰수 {
    public static void main(String args[]){
        int []number = {6,3,30,34,5,9};
        System.out.println(solution(number));

    }
    public static String solution(int[] numbers) {
        String []str = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numbers.length; i++){
            str[i]=Integer.toString(numbers[i]);
        }
        /*내림차순 : return(str2+str1).compareTo(str1+str2)
        * 오름차순 : return(str1+str2).compareTo(str2+str1)*/
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return (str2+str1).compareTo(str1+str2);
            }
        });
        if(str[0].equals("0")) return "0";
        for(String i : str){
            sb.append(i);
        }
        String answer = sb.toString();
        return answer;
    }
}
