package Programmers.level1;

public class PG_하샤드수 {
    public static void main(String args[]){

    }
    public static boolean solution(int x) {
        int sum = 0;
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }

        if (x % sum == 0) {
            return true;
        } else
            return false;
    }
}
