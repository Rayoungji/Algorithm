package Programmers.bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PG_소수찾기 {
    private static int count;
    private static Set<Integer> set = new TreeSet<>();
    public static void main(String args[]){
        String numbers = "17";
        System.out.println(solution(numbers));
    }
    public static int solution(String numbers) {
        List<Character> array = new ArrayList<>();
        for(int i=0; i<numbers.length(); i++){
            array.add(numbers.charAt(i));
        }
        List<Character> result = new ArrayList<>();
        for(int i=0; i<numbers.length(); i++){
            permutation(array,result,array.size(),i+1);
        }
        return count;
    }

    //맨 앞숫자가 0 인것 제외, 동일한 숫자 제외
    public static void permutation(List<Character> array, List<Character> result, int n, int r) {

        if(r == 0) {
            if(!result.get(0).equals('0')) {
                String str = "";
                for(int i=0; i<result.size(); i++){
                    str+=result.get(i);
                }
                if(!set.contains(Integer.parseInt(str))) {
                    if( isPrime(Integer.parseInt(str))) {
                        count++;
                    }
                    set.add(Integer.parseInt(str));
                }

            }

            return;
        }
        for(int i=0; i<n; i++){
            result.add(array.remove(i));
            permutation(array,result,n-1,r-1);
            array.add(i,result.remove(result.size()-1));
        }
    }

    //소수 찾기
    private static boolean isPrime(int n) {

        int i;
        int sqrt = (int) Math.sqrt(n);

        // 2는 유일한 짝수 소수
        if (n == 2)
            return true;

        // 짝수와 1은 소수가 아님
        if (n % 2 == 0 || n == 1)
            return false;

        // 제곱근까지만 홀수로 나눠보면 됨
        for (i = 3; i <= sqrt; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
