package nhn;

import java.util.PriorityQueue;
import java.util.Queue;

public class ex5 {
    public static void main(String args[]){
        int votes[] = {5,7};
        System.out.println(solution(votes));
    }
    public static int solution(int[] votes){
        int result = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i=1; i<votes.length; i++){
            queue.add(votes[i]);
        }
        while (votes[0] <= queue.peek()) {
            votes[0] = votes[0]+1;
            queue.add(queue.poll()-1);
            result++;
        }
        return result;
    }
}
