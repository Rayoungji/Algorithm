package codingTest.naver;

import java.util.List;
import java.util.Stack;

public class Test1 {

    Stack<Integer> firstStack = new Stack<>();
    Stack<Integer> secondStack = new Stack<>();

    public void putSolution(int i) {
        firstStack.add(i);
    }

    public int getSolution(){
        while (!firstStack.isEmpty()) {
            secondStack.add(firstStack.pop());
        }
        int answer = secondStack.pop();
        while (!secondStack.isEmpty()) {
            firstStack.add(secondStack.pop());
        }
        return answer;
    }

}
