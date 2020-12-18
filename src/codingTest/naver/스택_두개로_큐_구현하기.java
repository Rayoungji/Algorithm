package codingTest.naver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 스택_두개로_큐_구현하기 {

    public static void main(String args[]){

        StackQueue stackQueue = new StackQueue();
        stackQueue.inQueue(1);
        stackQueue.inQueue(2);
        stackQueue.inQueue(3);
        stackQueue.outQueue();
        stackQueue.inQueue(4);

        System.out.println("StackQueue: " + stackQueue.outQueue());



    }

    public static class StackQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        void inQueue(int input) {
            stack1.add(input);
        }

        int outQueue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.add(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }
}
