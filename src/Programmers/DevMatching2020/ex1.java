package Programmers.DevMatching2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex1 {

    public static void main(String args[]) {
        String word = "EIO";
        System.out.println(solution(word));

    }

    public static int solution(String word) {

        int answer = 0;
        List<Character> characters = new ArrayList<>();
        Map<String, Integer> map =new HashMap<>();
        map.put("A",0);
        map.put("E",1);
        map.put("I",2);
        map.put("O",3);
        map.put("U",4);


        for (int i = 0; i < word.length(); i++) {
            characters.add(word.charAt(i));
            System.out.println(characters.get(i));
            System.out.println(map.get(characters.get(i).toString()));

            if (i == 0) {
                answer += (map.get(characters.get(i).toString()) * 781) + 1;
            }
            if (i == 1) {
                answer += (map.get(characters.get(i).toString()) * 156) + 1;
            }
            if (i == 2) {
                answer += (map.get(characters.get(i).toString()) * 31) + 1;
            }
            if (i == 3) {
                answer += (map.get(characters.get(i).toString()) * 6) + 1;
            }
            if (i == 4) {
                answer += (map.get(characters.get(i).toString())) + 1;
            }
        }

        return answer;
    }

}
