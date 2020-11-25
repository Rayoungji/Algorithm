package Programmers.Queue;

import java.util.*;

public class PG_프린터 {
    public static void main(String args[]) {
        int priorities[] = {7, 5, 4, 3, 8, 7, 4, 8, 7, 9, 8, 4, 4, 4, 1, 3, 3, 5, 9, 1, 9, 9, 7, 9, 7, 2, 7, 7, 1, 5, 9, 8, 7, 2, 8, 3, 6, 2};
        int a = solution(priorities, 21);
        System.out.println(a);
    }

    public static int solution(int[] priorities, int location) {
        Queue<Integer> priority = new LinkedList<>();
        Queue<Integer> locate = new LinkedList<>();

        ArrayList<Integer> sortedPriority = new ArrayList<>();

        int index = 0;
        for (int i : priorities) {
            sortedPriority.add(i);
            priority.add(i);
            locate.add(index);
            index++;
        }

        Collections.sort(sortedPriority,Collections.reverseOrder());

        int answer[] = new int[priorities.length];
        int count = 1;
        for (int i : sortedPriority) {
            while (true) {
                if (priority.peek() == i) {
                    priority.poll();
                    answer[locate.poll()] = count;
                    count++;
                    break;
                } else {
                    priority.add(priority.poll());
                    locate.add(locate.poll());
                }
            }
        }
        return answer[location];
    }
}
