package Programmers.level1;

public class PG_문재열내_p와y의_갯수 {
    public static void main(String args[]) {
        String s = "pyY";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        char chars[] = s.toCharArray();
        int pNum = 0;
        int yNum = 0;
        for (char i : chars) {
            if (i == 'p' || i == 'P') {
                pNum++;
            }
            if (i == 'y' || i == 'Y') {
                yNum++;
            }
        }
        if (pNum == yNum) {
            return true;
        } else {
            return false;
        }
    }
}
