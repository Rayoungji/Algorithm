package Programmers.heap;

import java.util.PriorityQueue;

public class PG_더_맵게 {
    public static void main(String args[]) {
        int scoville[] = {7};
        int a = solution(scoville, 0);
        System.out.println(a);
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i : scoville) {
            priorityQueue.add(i);
        }
        int count = 0;
        while (priorityQueue.size() >=2) {
            if (priorityQueue.peek() < K) {
                int sum = priorityQueue.poll() + (priorityQueue.poll() * 2);
                priorityQueue.add(sum);
                count++;
            }else {
                break;
            }
        }
        if(priorityQueue.peek() < K){
            return -1;
        }
        return count;
    }
}
