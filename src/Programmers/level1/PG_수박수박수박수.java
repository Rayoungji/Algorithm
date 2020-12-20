package Programmers.level1;

public class PG_수박수박수박수 {
    public static void main(String args[]){
        System.out.println(solution(5));
    }
    public static String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i< n; i++){
            if (i%2==0){
               stringBuilder.append("수");
            } else {
                stringBuilder.append("박");
            }
        }
        return stringBuilder.toString();
    }
}
