package codingTest.naver.webtoon;

import java.util.Arrays;
import java.util.Collections;

public class 쿠폰 {

    public static void main(String args[]) {
        int[] prices = {13000, 88000, 10000};
        int[] discounts = {30,20};
        System.out.println(solution(prices,discounts));
    }

    public static int solution(int[] prices, int[] discounts) {
        int answer = 0;
        Integer p[] = Arrays.stream(prices).boxed().toArray(Integer[]::new);
        Integer d[] = Arrays.stream(discounts).boxed().toArray(Integer[]::new);
        Arrays.sort(p,Collections.reverseOrder());
        Arrays.sort(d,Collections.reverseOrder());
        for (int i=0; i<d.length; i++) {
            int discountPrice = p[i]*d[i]/100;
            answer = answer + (p[i] - discountPrice);
        }
        if (discounts.length < prices.length) {
            for (int i=d.length; i<p.length; i++) {
                answer = answer + p[i];
            }
        }
        return answer;
    }
}
