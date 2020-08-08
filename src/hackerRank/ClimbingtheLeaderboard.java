package hackerRank;

import java.io.IOException;
import java.util.*;

public class ClimbingtheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int answer[] = new int[alice.length];
        Deque<Integer> Rank = new LinkedList<>();
        for (int i = 0; i < scores.length; i++) {
            if (!Rank.contains(scores[i])) {
                Rank.addFirst(scores[i]);
            }
        }
        //Ranks - 오름차순으로 점수저장
        int Ranks[] = new int[Rank.size()];
        int z = 0;
        while (!Rank.isEmpty()) {
            Ranks[z] = Rank.pollFirst();
            z++;
        }
        int first =0;
        int mid = 0;
        int last = Ranks.length-1;
        for(int i=0; i<alice.length; i++){
            mid = (first+last)/2;
            while(first <= last){
                if(Ranks[mid]>alice[i]){

                }
                if(Ranks[mid]>alice[i]){
                    first=mid+1;
                }else{
                    last=mid-1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        int scores[]={100,90,90,80,75,60};
        int alice []={50,65,77,90,102};
       climbingLeaderboard(scores,alice);
    }
}
