package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Inversions {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(1);
        list.add(4);
        list.add(5);
        System.out.println(maxInversions(list));
    }

    public static long maxInversions(List<Integer> arr) {

        long answer = 0;

        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                for(int k=j+1; k<arr.size(); k++) {
                    if(arr.get(i) > arr.get(j) && arr.get(j) > arr.get(k)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
