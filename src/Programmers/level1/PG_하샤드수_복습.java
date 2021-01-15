package Programmers.level1;

public class PG_하샤드수_복습 {
    public static void main(String args[]) {
        System.out.println(solution(12));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        char[] chars = String.valueOf(x).toCharArray();
        int num = 0;
        for (char i : chars) {
            num += Integer.parseInt(String.valueOf(i));
        }
        if (x % num == 0) {
            return true;
        } else {
            return false;
        }
    }
}
