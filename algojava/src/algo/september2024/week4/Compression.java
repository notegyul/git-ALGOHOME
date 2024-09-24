package algo.september2024.week4;

import java.util.ArrayList;
import java.util.HashMap;

// 240924 - 압축
public class Compression {
    public int[] solution(String msg) {

        ArrayList<Integer> list = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=1; i<=alphabet.length(); i++) {
            map.put(String.valueOf(alphabet.charAt(i-1)), i);
        }

        int idx = 0;

        while (idx < msg.length()) {
            String current = "";

            // map에 존재하는 가장 긴 문자열(압축된)을 찾는 과정
            while (idx < msg.length() && map.containsKey(current + msg.charAt(idx))) {
                current += msg.charAt(idx);
                idx++;
            }

            list.add(map.get(current));

            if (idx < msg.length()) {
                map.put(current + msg.charAt(idx), map.size()+1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
