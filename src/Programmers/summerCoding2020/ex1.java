package Programmers.summerCoding2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex1 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int answer = p;
        Boolean isDone= true;
        while (isDone){
            answer++;
            String strYear = Integer.toString(answer);
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<strYear.length(); i++){

                if(stack.contains(strYear.charAt(i))){
                    continue;
                }
                if(!stack.contains(strYear.charAt(i))){
                    stack.add(strYear.charAt(i));
                }
            }
           if(stack.size()>=4){
               isDone=false;
               break;
           }
        }
        System.out.println(answer);
    }
}
