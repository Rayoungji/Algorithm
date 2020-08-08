package hackerRank;

import java.util.*;

public class ProfitsTarget {
    public static void main(String args[]) {
        List<Integer> stocksProfit = new ArrayList<>();
        //stocksProfit.add(7);
        stocksProfit.add(6);
        stocksProfit.add(12);
        stocksProfit.add(3);
        stocksProfit.add(9);
        stocksProfit.add(3);
        stocksProfit.add(5);
        stocksProfit.add(1);
        //stocksProfit.add(47);

        System.out.println(stockPairs(stocksProfit, 12));
    }

    public static int stockPairs(List<Integer> stocksProfit, long target) {
        int count = 0;

        Set<Integer> set = new HashSet<>();
        int halfCnt = 0;
        for(int stock : stocksProfit) {
            if(target / 2 == stock)
                halfCnt++;
            set.add(stock);
        }

        count += halfCnt/2;

        for(int stock : stocksProfit) {
            if(target/2 == stock)
                continue;
            if(set.contains((int)target-stock)) {
                set.remove((int)target-stock);
                set.remove(stock);
                count++;
            }
        }
        return count;
    }
}
