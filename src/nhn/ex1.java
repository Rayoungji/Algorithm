package nhn;

public class ex1 {
    public static void main(String args[]){

        int goods[] = {5,31,15};
        System.out.println(solution(goods));
    }
    public static int solution(int[] goods){
        int sale = 0;
        int sum = 0;
        int total = 0;

        for(int i : goods){
            total = total+i;
            if(i >= 50){
                sale=sale+10;
            } else {
                sum = sum+i;
            }
        }
        if(sum >= 50) {
            sale = sale+10;
        }

        return total-sale;
    }
}
