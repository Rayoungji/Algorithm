package Programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class PG_실패율 {
    public static void main(String args[]){

    }
    public static int[] solution(int N, int[] stages) {

        int[] cur = new int[N+1];
        for(int i = 0 ; i < stages.length; i++) {
            if(stages[i] != N+1)
                cur[stages[i]]++;
        }

        int total = stages.length;
        fail[] fails = new fail[N+1];
        fails[0] = new fail(1000, -1);
        for(int i = 1 ; i < cur.length ; i++) {
            if(total == 0){
                fails[i] = new fail(i, 0);
            }else
                fails[i] = new fail(i, (double)cur[i]/total);
            total -= cur[i];
        }

        Arrays.sort(fails, new Comparator<fail>() {
            public int compare(fail o1, fail o2) {
                if(o1.rate != o2.rate) {
                    return -Double.compare(o1.rate, o2.rate);
                }
                return o1.num - o2.num;
            }
        });

        int[] ans = new int[N];
        for(int i = 0 ; i < N; i++) {
            ans[i] = fails[i].num;
        }
        return ans;

    }
    static class fail{
        int num;
        double rate;
        fail(int num, double rate){
            this.num = num;
            this.rate = rate;
        }
    }
}
