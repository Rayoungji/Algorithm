package Programmers.bruteForce;

import java.util.ArrayList;
import java.util.List;

/*nPr
 - n개의 원소들 중에서 r만큼 뽑아 만들수 있는 모든 경우의 수
 - 중북된 집합도 다른 집합으로 취급한다 ex){2,1}과 {1,2}은 다른 집합으로 취급
 */
public class PermutationPractice {
    public static void main(String args[]) {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        List<String> result = new ArrayList<>();
        permutation(arr,result,arr.size(),2); //3P2의 값 구하기 (순열)
    }

    public static void permutation(List<String> array, List<String> result,int n,int r) {

        if (r == 0) {

            System.out.println(result.toString());
            return;
        }


        for(int i=0; i<n; i++){
            result.add(array.remove(i)); //원본 리스트에서 하나를 뽑는다
            permutation(array,result,n-1,r-1); //남은 하나를 뽑는다
            array.add(i,result.remove(result.size()-1));
        }
    }
}
