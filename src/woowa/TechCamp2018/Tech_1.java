package woowa.TechCamp2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Tech_1 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int d = Integer.parseInt(str[1]);
        int k = Integer.parseInt(str[2]);
        int j = Integer.parseInt(str[3]);
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (d == 1) {
                deque.addFirst(i);
            }
            if (d == 0) {
                deque.addLast(i);
            }
        }

        int start = deque.pollLast();
        if (start == 1) {
            deque.addFirst(start);
        } else {
            deque.addLast(start);
        }

        while (!(deque.size() == 1)) {
            for (int i = 1; i < k; i++) {
                deque.addFirst(deque.pollLast());
            }
            deque.removeLast();
            k += j;
        }

        System.out.println(deque.removeLast());
    }
}
