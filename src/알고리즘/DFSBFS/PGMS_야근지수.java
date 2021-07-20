package 알고리즘.DFSBFS;

import java.util.Collections;
import java.util.PriorityQueue;

public class PGMS_야근지수 {

    public static void main(String args[]) {
        int[] works = {4,3,3};
        System.out.println(solution(4,works));
    }

    public static long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for (int i : works) {
            queue.offer(i);
            sum += i;
        }
        if (sum < n) {
            return 0;
        }
        dfs(n,0,queue);
        long answer = 0;
        while (!queue.isEmpty()) {
            answer += Math.pow(queue.poll(), 2);
        }
        return answer;
    }

    public static void dfs(int n, int cnt, PriorityQueue<Integer> works) {
        if (cnt == n) {
            return;
        } else {
            int work = works.poll() -1;
            works.offer(work);
            dfs(n,cnt+1, works);
        }
    }
}
