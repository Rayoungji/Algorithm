package nhn;

import java.util.ArrayList;

public class ex4 {
    public static void main(String args[]) {
        System.out.println(solution("34"));
    }
    public static String solution(String cardNumber){
        int cardNum[] = new int[cardNumber.length()];
        for (int i=0; i<cardNumber.length(); i++){
            cardNum[i] = Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
        }
        ArrayList<Integer> tempCardNum = new ArrayList<>();
        for(int i=0; i<cardNum.length; i++){
            if(cardNum.length%2 == 0) {
                if((i+1)%2 == 0) {
                    tempCardNum.add(cardNum[i]);
                } else {
                    int num = cardNum[i]*2;
                    String str = String.valueOf(num);
                    for (int j=0; j<str.length(); j++) {
                        tempCardNum.add(Integer.parseInt(String.valueOf(str.charAt(j))));
                    }

                }
            } else {
                if((i+1)%2 == 0) {
                    int num = cardNum[i]*2;
                    String str = String.valueOf(num);
                    for (int j=0; j<str.length(); j++) {
                        tempCardNum.add(Integer.parseInt(String.valueOf(str.charAt(j))));
                    }
                } else {
                    tempCardNum.add(cardNum[i]);
                }
            }
        }
        int result = 0;
        for (int i : tempCardNum) {
            result = result+i;
        }
        if (result%10 == 0) {
            return "VALID";
        } else {
           return  "INVALID";
        }
    }
}
