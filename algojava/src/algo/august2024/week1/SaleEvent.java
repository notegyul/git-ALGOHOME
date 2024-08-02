package algo.august2024.week1;

import java.util.HashMap;

// 240802 - 할인 행사
public class SaleEvent {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 멤버십 시작일로부터 10일간 유효하기 때문
        for (int i=0; i<discount.length-9; i++) {
            HashMap<String, Integer> day10 = new HashMap<>();

            // 시작일(i) 포함 10일
            for (int j=i; j<i+10; j++) {
                if (wantMap.containsKey(discount[j])) {
                    day10.put(discount[j], day10.getOrDefault(discount[j], 0)+1);
                }
            }

            // HashMap의 equals => size, key-value 모두 일치하면 true 반환
            if (wantMap.equals(day10)) {
                answer++;
            }
        }

        return answer;
    }
}
