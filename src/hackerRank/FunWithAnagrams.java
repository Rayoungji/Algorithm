package hackerRank;

import java.util.*;

public class FunWithAnagrams {
    public static void main(String args[]){
        List<String> text = new ArrayList<>();
        text.add("code");
        text.add("aaagmnrs");
        text.add("anagrams");
        text.add("doce");
        System.out.println(String.valueOf(funWithAnagrams(text)));
    }
    public static List<String> funWithAnagrams(List<String> text) {
        List<String> anagrams = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        for (String i : text) {
            char[]  arr = i.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if (!anagrams.contains(str)) {
                anagrams.add(str);
                answer.add(i);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
