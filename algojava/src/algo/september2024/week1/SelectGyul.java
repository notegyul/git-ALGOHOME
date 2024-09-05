package algo.september2024.week1;

import java.util.*;

// 240905 - 귤 고르기
public class SelectGyul {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        for (int n : list) {
            k -= n;
            answer++;

            if (k <= 0)
                break;
        }

        return answer;
    }
    // 그리디
}
