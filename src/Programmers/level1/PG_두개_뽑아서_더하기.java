package Programmers.level1;

import java.util.*;

public class PG_두개_뽑아서_더하기 {
    private static Set<Integer> set = new HashSet<>();

    public static void main(String args[]){
        int numbers[] = {5,0,2,7};
       int an[] = solution(numbers);
       for (int i : an) {
           System.out.println(i);
       }
    }

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }
        List<Integer> result = new ArrayList<>();
        permutation(list, result, list.size(), 2);
        List<Integer> answerList = new ArrayList<>();
        for (int i : set) {
            answerList.add(i);
        }
        Collections.sort(answerList);
        int answer[] = new int[answerList.size()];
        for (int i=0; i<answerList.size(); i++){
            answer[i]= answerList.get(i);
        }
        return answer;
    }
    public static void permutation(List<Integer> number, List<Integer> result, int n, int p) {
        if(p == 0) {
            int sum = result.get(0) + result.get(1);
            if(!set.contains(sum)) {
                set.add(sum);
            }
            return;
        }

        for(int i=0; i<n; i++){
            result.add(number.remove(i));
            permutation(number,result,n-1,p-1);
            number.add(i,result.remove(result.size()-1));
        }
    }
}
