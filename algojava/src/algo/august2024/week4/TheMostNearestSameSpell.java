package algo.august2024.week4;

import java.util.HashMap;

// 240822 - 가장 가까운 글자
public class TheMostNearestSameSpell {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                answer[i] = -1;
                map.put(c, i);
                i++;
                continue;
            }

            answer[i] = i - map.get(c);
            map.put(c, i);
            i++;
        }

        return answer;
    }
}
