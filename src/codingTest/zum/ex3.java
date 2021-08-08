package codingTest.zum;

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

        //양 끝점의 최대값을 구하고
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
