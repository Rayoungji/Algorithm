package Programmers.hash;

public class PG_전화번호_목록 {

    public static void main(String args[]) {

        String[] phone_book = new String[3];
        phone_book[0] = "119";
        phone_book[1] = "97674223";
        phone_book[2] = "1195524421";
        boolean answer = solution(phone_book);
        System.out.println(answer);

    }

    public static boolean solution(String[] phone_book) {
        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
        return true;
    }
}
