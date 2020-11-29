package Programmers.level1;

public class PG_소수찾기 {
    public static void main(String args[]) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;
        boolean isPrime[] = new boolean[n+1];

        for (int i=2; i<=n; i++){
            isPrime
                    [i] = true;
        }


        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(isPrime[i]) {
                for (int j=i; i*j<=n; j++){
                    isPrime[j*i] = false;
                }
            }
        }

        for (int i=2; i<=n; i++){
            if(isPrime[i]){
                answer++;
            }
        }

        return answer;
    }
}
