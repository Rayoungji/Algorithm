package 알고리즘.구현;

import java.util.Stack;

public class PGMS_괄호변환 {

    static int position;

    public boolean isCorrect(String p) {
        int left = 0;
        int right = 0;
        boolean isCorrect = true;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<p.length(); i++) {
            if (p.charAt(i) == '(') {
                stack.add('(');
                left++;
            } else {
                right++;
                if (stack.isEmpty()) isCorrect = false;
            }
            if (left == right) {
                //u의 사이즈, v의 시작점
                position = i+1;
                return isCorrect;
            }
        }
        return isCorrect;
    }

    public String solution(String p) {
        if (p.isEmpty()) return p;
        boolean isTrue = isCorrect(p);
        String u = p.substring(0, position);
        String v = p.substring(position, p.length());
        if (isTrue) {
            return u + solution(v);
        }

        String answer = "(" + solution(v) + ")";
        for (int i=1; i<u.length()-1; i++) {
            if (u.charAt(i) == '(') {
                answer = answer + ")";
            } else {
                answer = answer + "(";
            }
        }

        return answer;
    }
}
