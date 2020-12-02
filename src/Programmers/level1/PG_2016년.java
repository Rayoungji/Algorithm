package Programmers.level1;

public class PG_2016년 {
    public static void main(String args[]) {
        System.out.println(solution(5, 24));
    }

    public static String solution(int a, int b) {
        String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int totalDay = 0;
        for (int i = 1; i < a; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                totalDay = totalDay + 30;
            } else if (i == 2) {
                totalDay = totalDay + 29;
            } else {
                totalDay = totalDay + 31;
            }
        }
        totalDay = totalDay + b + 4;

        return day[totalDay%7];
    }
}
