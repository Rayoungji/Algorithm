package hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PerfectSubString {
    public static void main(String args[]) {
        System.out.println(perfectSubstring("1221221121", 3));
    }

    public static int perfectSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int answer = 0;
        for (char i : chars) {
            map.put(i, 0);
        }
        for (int i = 0; i < chars.length; i++) {
            List<Character> subString = new ArrayList<>();
            for (int j = i; j < chars.length; j++) {
                if (map.get(chars[j]) <= k) {
                    map.put(chars[j], map.get(chars[j]) + 1);
                    subString.add(chars[j]);
                }
                if (map.get(chars[j]) > k) {
                    break;
                }
                if (map.get(chars[j]) == k) {
                    Boolean isSuccess = true;

                    for (Integer value : map.values()) {
                        if (value != k) {
                            isSuccess = false;
                        }
                    }
                    if (isSuccess) {
                        answer++;
                    }
                }
            }
            for (Character c : map.keySet()) {
                map.put(c, 0);
            }
        }
        return answer;
    }

    public static int perfectSubstring2(String s, int k) {

        int answer = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            Map<Character, Integer> map = new HashMap<>();

            for (int j = i; j < chars.length; j++) {

                char c = chars[j];
                int count = map.getOrDefault(c, 0);
                map.put(c, count + 1);

                if (map.size() * k == (j - i + 1)) {
                    if (check(map, k)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static boolean check(Map<Character, Integer> map, int k) {

        for (Integer i : map.values()) {
            if (i != k) {
                return false;
            }
        }
        return true;
    }
}
