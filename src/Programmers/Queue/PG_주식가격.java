package Programmers.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class PG_주식가격 {
    public static void main(String args[]) {
        int price[] = {1,2,3,2,3};

        for(int i : solution(price)) {
            System.out.println(i);
        }
    }

//    public static int[] solution(int[] prices) {
//        Deque<Integer> deque = new ArrayDeque<>();
//
//        //순서대로 넣기
//        for (int i : prices) {
//            deque.addLast(i);
//        }
//        //주식 갯수
//        int size = deque.size();
//        int countSize = size-1;
//
//        int[] answer = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            Boolean isDone = false;
//            int count = 0;
//            int price = deque.removeFirst();
//            for (int j = 0; j < countSize; j++) {
//                    int check = deque.pollFirst();
//                    if (price <= check && !isDone) {
//                        count++;
//                        deque.addLast(check);
//                    } else if (price > check && !isDone) {
//                        count++;
//                        deque.addLast(check);
//                        isDone=true;
//                    } else if(isDone) {
//                        deque.addLast(check);
//                    }
//            }
//            answer[i] = count;
//            countSize--;
//        }
//        return answer;
//    }

    public static int[] solution(int[] prices) {
       int answer[] = new int[prices.length];
        for (int i=0; i<prices.length; i++){
            int count =0;
            for(int j=i+1; j<prices.length; j++) {

                if(prices[i] <= prices[j]) {
                    count++;
                } else {
                    count++;
                    break;
                }
            }
            answer[i]=count;
        }

        return answer;

    }
}
