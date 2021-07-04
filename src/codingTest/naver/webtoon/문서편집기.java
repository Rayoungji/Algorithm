package codingTest.naver.webtoon;

import java.util.stream.Stream;

public class 문서편집기 {

    public static void main(String args[]) {
        System.out.println(solution("aabcbcd","abc"));

    }
    public static int solution(String s, String t) {
        int result = 0;
        String s1 = s;
        while (s1.contains(t)) {
            s1 = s1.replace(t,"");
            result++;
        }
        return result;
    }
}
