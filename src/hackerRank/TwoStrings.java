package hackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TwoStrings {
    public static void main(String args[]) throws IOException {
        List<String> a = new ArrayList<>();
        a.add("hello");
        a.add("hi");
        List<String> b =new ArrayList<>();
        b.add("world");
        b.add("bye");
        commonSubstring(a,b);
    }

    public static void commonSubstring(List<String> a, List<String> b) {
        String aStr = "";
        String bStr = "";
        for (int i = 0; i < a.size(); i++) {
            aStr = a.get(i);
            bStr = b.get(i);

            int[] alphabet = new int[200];

            for (int j = 0; j < aStr.length(); j++) {
                alphabet[aStr.charAt(j) - '0'] = 1;
            }

            boolean check = false;
            for (int k = 0; k < bStr.length(); k++) {
                if (alphabet[bStr.charAt(k) - '0'] != 0) {
                    check = true;
                    System.out.println("YES");
                    break;
                }
            }

            if (!check) {
                System.out.println("NO");
            }
        }
    }
}
