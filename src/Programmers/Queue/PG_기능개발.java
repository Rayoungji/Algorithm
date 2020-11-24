package Programmers.Queue;

import java.util.*;

public class PG_기능개발 {
    public static void main(String args[]) {

        int progresses[] = {55};
        int speeds[] = {1};
       for(int i : solution(progresses,speeds)) {
           System.out.println(i);
       }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int array[] = new int[progresses.length];
        Stack<Integer> stack = new Stack<>();

        //각 기능에 대해 남은 시간들
        for(int i=progresses.length-1; i>=0; i--){
            stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));
        }

        ArrayList<Integer> answer = new ArrayList<>();
        while (!stack.isEmpty()) {
            int point = stack.pop();
            int count =1;
            while (!(stack.isEmpty()) && point >= stack.peek()){
                count++;
                stack.pop();
            }
            answer.add(count);
        }

        int result[] = new int[answer.size()];
        for(int i=0; i<answer.size(); i++) {
            result[i]=answer.get(i);
        }
        return result;
    }
}
