package algo.july2024.week1;

import java.util.HashMap;

// 240705 - 실패율
public class FailureRate {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int N, int[] stages) {

            // N+2 크기의 배열을 만들어 각 스테이지에 도달한 사용자의 수 업데이트
            int[] users = new int[N+2];
            for (int s: stages) {
                users[s]++;
            }

            HashMap<Integer, Double> fail = new HashMap<>();
            double total = stages.length;
            for (int i=1; i<=N; i++) {
                // 특정 스테이지 도달 인원이 0 -> 실패율 또한 0
                if (users[i] == 0) {
                    fail.put(i, 0.0);
                } else {
                    fail.put(i, users[i]/total);
                    total -= users[i];
                }
            }

            return fail.entrySet()
                    .stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                    .mapToInt(HashMap.Entry::getKey).toArray();
        }
    }
}
