package algo.august2024.week5;

import java.util.HashMap;

// 240831 - 완주하지 못한 선수
public class PlayerWhoCannotFinish {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();
        for (String parti : participant) {
            map.put(parti, map.getOrDefault(parti, 0) + 1);
        }

        for (String com : completion) {
            map.put(com, map.get(com)-1);

            if (map.get(com) == 0)
                map.remove(com);
        }

        return map.keySet().iterator().next();
    }

    /**
     * remove()를 굳이 하지 않으면 iterator() 안 써도 됨
     *
     * for (String key : map.keySet()) {
     *     if (map.get(key) != 0)
     *         String answer = key;
     * }
     *
     * return answer;
     */

}
