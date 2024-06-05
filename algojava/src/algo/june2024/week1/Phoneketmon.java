package algo.june2024.week1;

import java.util.HashMap;
import java.util.Map;

public class Phoneketmon {
    public static void main(String[] args) {

    }

    // 20240605
    public int solution(int[] nums) {
        int answer = 0;

        Map<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            if (!hm.containsKey(n)) {
                hm.put(n, 1);
                continue;
            }
            int curValue = hm.get(n);
            hm.put(n, curValue+1);
        }

        int N = nums.length;
        if (hm.size() >= N/2) {
            answer = N/2;
        } else {
            answer = hm.size();
        }

        return answer;
    }
}
