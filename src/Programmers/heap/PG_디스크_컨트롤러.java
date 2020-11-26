package Programmers.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PG_디스크_컨트롤러 {
    public static void main(String args[]){

        int jobs[][] = new int[3][2];
        jobs[0][0] = 0;
        jobs[0][1] = 3;
        jobs[1][0] = 1;
        jobs[1][1] = 9;
        jobs[2][0] = 2;
        jobs[2][1] = 6;

        for (int[] a : jobs) {
            System.out.println(a[1]);
        }
    }
    public int solution(int[][] jobs) {

        LinkedList<Job> waiting = new LinkedList<>();
        PriorityQueue<Job> pq = new PriorityQueue<>(new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2) {
                return j1.workingTime - j2.workingTime;
            }
        });

        for(int[] job : jobs) {
            waiting.offer(new Job(job[0], job[1]));
        }

        Collections.sort(waiting, new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2) {
                return j1.requestTime - j2.requestTime;
            }
        });

        int answer = 0;
        int cnt = 0;
        int time = waiting.peek().requestTime;

        while(cnt < jobs.length) {
            while(!waiting.isEmpty() && waiting.peek().requestTime <= time) {
                pq.offer(waiting.pollFirst());
            }

            if(!pq.isEmpty()) {
                Job job = pq.poll();
                time += job.workingTime;
                answer += time - job.requestTime;
                cnt++;
            } else {
                time++;
            }
        }

        return answer / cnt;
    }

    class Job {
        int requestTime;
        int workingTime;

        Job(int requestTime, int workingTime) {
            this.requestTime = requestTime;
            this.workingTime = workingTime;
        }
    }
}


