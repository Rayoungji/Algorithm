package Programmers.level1;

public class PG_문재열내_p와y의_갯수 {
    public static void main(String args[]) {
        String s = "pyY";
        System.out.println(solution(s));
        System.out.println(solutionByStream(s));
    }

    public static boolean solution(String s) {
        s = s.toUpperCase();
        char chars[] = s.toCharArray();
        int pNum = 0;
        int yNum = 0;
        for (char i : chars) {
            if (i == 'P') {
                pNum++;
            }
            if (i == 'Y') {
                yNum++;
            }
        }
        if (pNum == yNum) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean solutionByStream(String s) {
        s = s.toUpperCase();
        return s.chars().filter(i -> 'P' == i).count() == s.chars().filter(i -> 'Y' == i).count();
    }
}
