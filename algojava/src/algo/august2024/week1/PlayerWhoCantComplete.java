package algo.august2024.week1;

import java.util.HashMap;

// 240801 - 완주하지 못한 선수
public class PlayerWhoCantComplete {
    public static void main(String[] args) {

    }

    public static String solution(String[] participants, String[] completion) {

        // 참가자 이름과 인원수를 저장할 해시 생성(동명이인 대비)
        HashMap<String, Integer> hash = new HashMap<>();
        for (String parti : participants) {
            if (!hash.containsKey(parti)) {
                hash.put(parti, 1);
                continue;
            }
            hash.replace(parti, hash.get(parti)+1);
        }

        for (String com : completion) {
            hash.replace(com, hash.get(com)-1);
            if (hash.get(com) == 0) {
                hash.remove(com);
            }
        }

        // Set에는 하나의 값만 저장돼 있기 때문에 굳이 반복까지 돌리지 말고 stream()을 이용한다.
        String answer = hash.keySet().stream().findFirst().get();
        return answer;
    }


}
