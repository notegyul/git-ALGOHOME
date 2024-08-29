package algo.august2024.week5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// 240829 - 로또 최고 순위와 최저 순위
public class Lotto {
    public int[] solution(int[] lottos, int[] winNums) {

        int[] answer = new int[2];
        // k: 매칭 수, v: 등수
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 6);
        for (int i=1; i<=6; i++) {
            map.put(i, 7-i);
        }

        Arrays.sort(lottos);

        HashSet<Integer> set = new HashSet<>();
        for (int win : winNums)
            set.add(win);

        int unknown = 0;        // 0의 수
        int match = 0;          // 매칭 수
        for (int lt : lottos) {
            if (lt == 0)
                unknown++;
            if (set.contains(lt))
                match++;
        }

        answer[1] = map.get(match);

        match += unknown;
        match = match > 6 ? 6 : match;

        answer[0] = map.get(match);

        return answer;
    }
}
