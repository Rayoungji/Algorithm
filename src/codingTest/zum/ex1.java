package codingTest.zum;


/**
 * 문제 설명
 * 임의의 자연수 n으로 나누었을 때, 그 몫과 나머지가 같아지는 자연수들을 모두 더한 값을 반환하도록 solution 함수를 완성하세요.
 *
 * 제한사항
 * n은 100,000 이하의 자연수입니다.
 * 입출력 예
 * n	result
 * 2	3
 * 3	12
 * 입출력 예 설명
 * 입출력 예 #1
 * n이 2일 때,
 *
 * 3을 2로 나누면 몫이 1이고, 나머지가 1
 * 나머지가 2 이상일 수 없으므로 3을 반환합니다.
 *
 * 입출력 예 #2
 * n이 3일 때,
 *
 * 4를 3으로 나누면 몫이 1이고, 나머지가 1
 * 8을 3으로 나누면 몫이 2이고, 나머지가 2
 * 나머지가 3 이상일 수 없으므로 4와 8을 더한 12를 반환합니다.
 */
public class ex1 {

    public static long solution(long n) {
        long answer = 0;
        for (int i=1; i<n; i++) {
            answer += (i*n) + i;
        }
        return answer;
    }
}
