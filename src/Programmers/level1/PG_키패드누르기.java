package Programmers.level1;

public class PG_키패드누르기 {
    public static void main(String args[]) {
        int[] num = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(solution(num, "left"));
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int right = 12;
        int left = 10;
        for (int i : numbers) {
            if (i == 1 || i == 4 || i == 7) {
                left = i;
                answer += "L";
            } else if (i == 3 || i == 6 || i == 9) {
                right = i;
                answer += "R";
            } else if (i == 2 || i == 5 || i == 8 || i == 0) {
                int leftLength;
                int rightLength;
                if (i == 0) {
                    leftLength = abs(left, 11);
                    rightLength = abs(right, 11);
                    i = 11;
                } else {
                    leftLength = abs(left, i);
                    rightLength = abs(right, i);
                }
                if (leftLength > rightLength) {
                    right = i;
                    answer += "R";
                } else if (leftLength < rightLength) {
                    left = i;
                    answer += "L";
                } else {
                    if (hand.equals("right")) {
                        right = i;
                        answer += "R";
                    } else {
                        left = i;
                        answer += "L";
                    }
                }
            }
        }
        return answer;
    }

    public static int abs(int num, int mid) {
        int midX = (mid - 1) / 3;
        int numX = (num - 1) / 3;
        int numY = (num - 1) % 3;
        return Math.abs(midX - numX) + Math.abs(1 - numY);
    }
}
