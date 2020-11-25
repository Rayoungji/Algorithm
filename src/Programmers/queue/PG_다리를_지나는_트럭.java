package Programmers.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PG_다리를_지나는_트럭 {
    public static void main(String args[]) {
        int[] truck = {7, 4, 5, 1, 6};
        int a = solution(2, 10, truck);
        System.out.println(a);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer>queue=new LinkedList<>();
        int sum=0;
        int answer=0;

        for(int i : truck_weights) {
            while (true) {
                if(queue.isEmpty()) {
                    queue.add(i);
                    sum = sum+i;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum=sum-queue.poll();
                } else {
                    if(sum+i > weight) {
                        queue.add(0);
                        answer++;
                    } else {
                        queue.add(i);
                        sum= sum+i;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;
    }
}
