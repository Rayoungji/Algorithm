package Programmers.level1;

import java.util.*;

public class PG_실패율 {
    public static void main(String args[]) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(5, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        List<Stage> stageList = new ArrayList<>();
        for (int i=1; i<=N; i++){
            int now = 0;
            int clear = 0;

            for (int stage : stages) {
                if (i <= stage) {
                    clear += 1;
                }
                if (i == stage) {
                    now += 1;
                }
            }

            if (clear == 0) {
                stageList.add(new Stage(i, 0));
            } else {
                stageList.add(new Stage(i, (double) now / clear));
            }
        }
        stageList.sort(Stage::compareTo);
        return stageList.stream().mapToInt(i -> i.stageNum).toArray();
    }

    public static class Stage implements Comparable<Stage> {
        int stageNum;
        double failRate;

        public Stage(int stageNum, double failRate) {
            this.stageNum = stageNum;
            this.failRate = failRate;
        }


        @Override
        public int compareTo(Stage o) {
            if (o.failRate < this.failRate) {
                return -1;
            } else if (o.failRate == this.failRate) {
                if(o.stageNum > this.stageNum) {
                    return -1;
                } else { return 1;}
            } else {
                return 1;
            }
        }
    }
}
