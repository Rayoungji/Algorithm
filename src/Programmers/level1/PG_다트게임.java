package Programmers.level1;

public class PG_다트게임 {
    public static void main(String args[]){
        System.out.println(solution("1S2D*3T"));
    }
    public static int solution(String dartResult) {
        int answer = 0;
        char[] chars = dartResult.toCharArray();
        int[] score = new int[3];
        int cnt = 0;
        for (int i=0; i<3; i++){
            for (char j : chars) {
                if (j=='S') {
                    score[i] = (int) Math.pow(cnt,1);
                    cnt = 0;
                }
                if (j=='D') {
                    score[i] = (int)Math.pow(cnt,2);
                    cnt = 0;
                }
                if (j=='T') {

                }
                if (j=='*') {
                    if (i > 1) {
                        score[i] = score[i]*2;
                        score[i-1] = score[i-1]*2;
                    }
                }
                if (j=='#') {

                } else {
                    cnt+=i;
                }
            }
        }
        return answer;
    }
}
