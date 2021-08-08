package codingTest.zum;

/**
 * 문제 설명
 * 히스토그램은 N개의 직사각형 모양의 막대가 아래 그림과 같이 붙어있는 그래프입니다. 아래 그림은 N = 6인 경우의 예시입니다.
 *
 * image
 *
 * 히스토그램의 각 칸의 간격은 1이며 높이는 정수로 주어집니다.
 *
 * 히스토그램의 영역이란 히스토그램의 막대 중 두 개를 선택한 후 두 막대 사이에 물을 채웠을 때 물이 최대로 차오를 수 있는 영역의 넓이를 말합니다.
 * 다음 그림은 두 개의 막대를 선택했을 때 두 막대 사이에 물을 최대로 채운 예시를 나타냅니다.
 *
 * image
 * 위 예시에서 영역의 넓이는 12입니다.
 *
 * image
 * 위 예시에서 영역의 넓이는 6입니다.
 *
 * 즉, 위와 같은 방식으로 두 개의 막대를 선택했을 때 물이 최대로 차오를 수 있는 영역의 넓이는 12입니다.
 *
 * 히스토그램의 높이가 배열 형태로 주어질 때 만들 수 있는 히스토그램의 영역중 최댓값을 반환하는 함수를 완성해 주세요.
 *
 * 제한사항
 * 히스토그램의 막대의 개수 N : 100,000이하의 자연수
 * 히스토그램의 막대의 높이 H : 10,000이하의 음이 아닌 정수
 * 입출력 예
 * histogram	result
 * [2, 2, 2, 3]	4
 * [6, 5, 7, 3, 4, 2]	12
 * 입출력 예 설명
 * 입출력 예 #1
 * 0번과 3번 막대를 이용하여 최대 영역의 넓이 4를 만들 수 있습니다.
 *
 * 입출력 예 #2
 * 0번과 4번 막대를 이용하여 최대 영역의 넓이 12를 만들 수 있습니다.
 */
public class ex3 {

    public static int solution(int[] histogram) {
        int answer = -1;
        int height = 0;
        for (int i=0; i<histogram.length; i++) {
            for (int j=i+2; j<histogram.length; j++) {
                height = Math.min(histogram[i], histogram[j]);
                answer = Math.max(answer, height*(j-i-1));
            }
        }
        return answer;
    }

    public static int maxArea(int[] height) {

        //가장 양쪽 끝점에서 시작해서
        int left = 0;
        int right= height.length - 1;

        //양 끝점의 최대값을 구하고 -> 넓이 * 높이
        int answer = (right-left-1) * Math.min(height[left], height[right]);

        while(left<right){
            //막대가 더 작은 값에 따라 값이 좌우하기 때문에 작은 막대를 계속 바꿔가면서
            if(height[left] <= height[right]) left++;
            else right--;

            //최대값 갱신
            answer = Math.max(answer, (right-left-1)*Math.min(height[left], height[right]));
        }

        return answer;
    }
}
