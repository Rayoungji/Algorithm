package Programmers.level1;

import java.util.Stack;

public class PG_크레인_인형뽑기 {

    public static void main(String args[]){
        int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int moves[] = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : moves) {
            for (int j=0; j<board.length; j++){
                if(board[j][i-1] != 0) {
                    if (!stack.isEmpty() && stack.peek()==board[j][i-1]) {
                        stack.pop();
                        answer = answer+2;
                        board[j][i-1] = 0;
                    } else {
                        stack.add(board[j][i-1]);
                        board[j][i-1] = 0;
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
