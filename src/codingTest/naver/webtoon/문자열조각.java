package codingTest.naver.webtoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 문자열조각 {
    static String[] realAnswer;
    public static void main(String args[]) {
        String[] answer = solution("abcxyqwertyxyabc");
        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static String[] solution(String s) {
        List<String> answer = new ArrayList<>();
        Stack<String> doubleAnswer = new Stack<>();
        char[] chars = s.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int end = chars.length-1;
        for (int i =0; i<chars.length/2; i++) {
            sb1.append(chars[i]);
            sb2.insert(0,chars[end]);
            if (sb1.toString().equals(sb2.toString())) {
                answer.add(sb1.toString());
                doubleAnswer.add(sb1.toString());
                sb1.setLength(0);
                sb2.setLength(0);
            }
            end--;
        }
        if(sb1.length() !=0 || sb2.length() !=0) {
            String string = sb1.toString() + sb2.toString();
            answer.add(string);
        }

        if (answer.size()==0) {
            realAnswer = new String[1];
            realAnswer[0] = s;
        } else {
            realAnswer = new String[answer.size() + doubleAnswer.size()];
            for (int i=0; i<answer.size(); i++) {
                realAnswer[i] = answer.get(i);
            }
            for (int i=answer.size(); i<realAnswer.length; i++) {
                realAnswer[i] = doubleAnswer.pop();
            }
        }
        return realAnswer;
    }

}
