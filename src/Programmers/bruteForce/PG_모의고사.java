package Programmers.bruteForce;

import java.util.*;

public class PG_모의고사 {

    public static void main(String args[]){
        int answer[] = {1,3,2,4,2};
        int result[] = solution(answer);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] solution(int[] answers) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int a = 0;
        int result[] = new int[3];
        for (int i: answers) {
            if (i == queue.peek()) {
                a++;
                queue.add(queue.poll());
            } else  {
                queue.add(queue.poll());
            }
        }
        result[0]=a;

        while (!queue.isEmpty()) {
            queue.poll();
        }

        queue.add(2);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        queue.add(2);
        queue.add(5);

        int b = 0;
        for (int i: answers) {
            if (i == queue.peek()) {
                b++;
                queue.add(queue.poll());
            } else  {
                queue.add(queue.poll());
            }
        }
        result[1]=b;

        while (!queue.isEmpty()) {
            queue.poll();
        }

        queue.add(3);
        queue.add(3);
        queue.add(1);
        queue.add(1);
        queue.add(2);
        queue.add(2);
        queue.add(4);
        queue.add(4);
        queue.add(5);
        queue.add(5);

        int c = 0;
        for (int i: answers) {
            if (i == queue.peek()) {
                c++;
                queue.add(queue.poll());
            } else  {
                queue.add(queue.poll());
            }
        }
        result[2]=c;

        int max =Math.max(Math.max(result[0],result[1]),result[2]);

        ArrayList<Integer>arrayList = new ArrayList<>();

        for(int i=0; i<result.length; i++){
            if(max == result[i]) {
                arrayList.add(i+1);
            }
        }

        int an[] = new int [arrayList.size()];
        for(int i=0; i<arrayList.size(); i++){
            an[i]=arrayList.get(i);
        }
        return an;
    }
}
