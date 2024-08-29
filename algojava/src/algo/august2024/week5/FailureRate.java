package algo.august2024.week5;

import java.util.*;

// 240828 - 실패율
public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int n = stages.length;
        Float[] rate = new Float[N+1];

        Arrays.sort(stages);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=1; i<=N; i++) {
            map.put(i, 0);
        }

        // N보다 큰 스테이지는 필요 없을 거 같아서 getOrDefault 대신 아래와 같이 씀
        for (int num : stages) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            }
        }

        // 스테이지 별 실패율
        for (int i=1; i<=N; i++) {
            rate[i] = (float) map.get(i)/n;
            n -= map.get(i);
        }

        int[] ans = new int[N];
        HashMap<Float, ArrayList<Integer>> rateMap = new HashMap<>();
        for (int i=1; i<=N; i++) {
            ArrayList<Integer> lst = new ArrayList<>();
            if (rateMap.containsKey(rate[i])) {
                lst = rateMap.get(rate[i]);
                lst.add(i);
                Collections.sort(lst);
                rateMap.put(rate[i], lst);
                continue;
            }

            lst.add(i);
            rateMap.put(rate[i], lst);
        }

        List<Integer> lst = new ArrayList<>();
        Arrays.sort(rate, Collections.reverseOrder());
        for (int i=1; i<=N; i++) {
            for (int j : rateMap.get(i)) {
                lst.add(j);
            }
        }

        for (int i=0; i<lst.size(); i++) {
            ans[i] = lst.get(i);
        }

        return ans;
    }


}
