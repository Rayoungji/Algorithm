package Programmers.bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class permutationPractice2 {
    private static int count=0;
    private static Set<Integer> set = new TreeSet<>();
    public static void main(String args[]){
        String str = "012";
        List<Character> arr = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            arr.add(str.charAt(i));
        }

        List<Character> result = new ArrayList<>();
        for (int i=0; i<arr.size(); i++){
            permutation(arr, result, arr.size(), i+1);
        }

        System.out.println("Total: "+count);

    }

    public static void permutation(List<Character> array, List<Character> result, int n, int r) {
        if(r == 0) {
            if(!result.get(0).equals('0')) {
                String str = "";
                for(int i=0; i<result.size(); i++){
                    str+=result.get(i);
                }
                if(!set.contains(Integer.parseInt(str))) {
                    System.out.println(Integer.parseInt(str));
                    set.add(Integer.parseInt(str));
                    count++;
                }
            }

            return;
        }
            for(int i=0; i<n; i++){
                result.add(array.remove(i)); //원본 리스트에서 하나를 뽑는다
                permutation(array,result,n-1,r-1); //남은 하나를 뽑는다
                array.add(i,result.remove(result.size()-1));
            }
    }
}
