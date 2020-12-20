package ndbYoutube;

import java.util.Arrays;

public class 랜덤함수 {
    public static void main(String args[]){
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(solution(array)));
    }
    public static int[] solution(int[] array){
        for (int i=0; i<50; i++){
            int n = (int) (Math.random()*10);
            int temp = array[0];
            array[0] = array[n];
            array[n] = temp;
        }
        return array;
    }
}
