package Programmers.sort;

import java.util.Arrays;
/*k개의 논문중 h번 인용된 논문이 h개 이상인 h의 최대값*/
public class PG_H_index {
    public static void main(String args[]){
        int []citation = {3,0,6,1,5};
        System.out.println(solution(citation));
    }
    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        for(int i=0; i<citations.length; i++){
            int h = citations.length - i;
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
