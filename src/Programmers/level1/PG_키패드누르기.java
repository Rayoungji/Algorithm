package Programmers.level1;

public class PG_키패드누르기 {
    public static void main(String args[]) {
        int[] num = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(solution(num, "right"));
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
                int leftX = (left - 1) / 3;
                int rightX = (right - 1) / 3;
                int midX;
                if (i == 0) {
                    midX = 11 % 3;
                } else {
                    midX = i % 3;
                }
                if (Math.abs(midX - leftX)+1 > Math.abs(midX - rightX)+1) {
                    answer += "L";
                    left = i;
                } else if (Math.abs(midX - leftX)+1 < Math.abs(midX - rightX)+1) {
                    answer += "R";
                    right = i;
                } else if (Math.abs(midX - leftX)+1 == Math.abs(midX - rightX)+1) {
                    if (hand.equals("right")) {
                        answer += "R";
                        right = i;
                    } else {
                        answer += "L";
                        left = i;
                    }
                }
            }
        }
        return answer;
    }
}
