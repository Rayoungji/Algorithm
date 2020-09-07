package Programmers.hash;

import java.util.HashMap;

public class PG_완주하지_못한_선수 {
    public static void main(String args[]) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> participantMap = new HashMap<>();
        for(String i : participant){
            participantMap.put(i,participantMap.getOrDefault(i,0)+1);  //해당 키 값이 존재하면 value 반환하고 존재하지 않으면 기본값을 반환
        }
        for(String i : completion){
           int val = participantMap.get(i)-1;
           participantMap.put(i,val);
        }
        for(String key : participantMap.keySet()) {
            if(participantMap.get(key) >= 1) {
                answer.append(key + ",");
            }
        }
        answer.deleteCharAt(answer.length()-1);
        return answer.toString();
    }
}
