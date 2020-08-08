package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderRank {
    public static void main(String arg[]){
        List<Integer> height =new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        //height.add(1);
        System.out.println(countStudents(height));
    }
    public static int countStudents(List<Integer> height) {
        int cnt = 0;
        List<Integer> copy = new ArrayList<>();
        for(int h : height)
            copy.add(h);

        Collections.sort(height);

        for(int i=0;i<height.size();i++){
            if(!height.get(i).equals(copy.get(i)))
                cnt++;
        }

        return cnt;

    }
}
