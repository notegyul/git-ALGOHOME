package algo.september2024.week1;

import java.util.ArrayList;
import java.util.Stack;

// 240907 - 기능 개발
public class FeatureDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {

        // 진도율 100 달성까지 필요한 시간
        int[] leadTime = new int[progresses.length];
        for (int i=0; i<progresses.length; i++) {
            int need = 100 - progresses[i];
            leadTime[i] = need % speeds[i] == 0 ? need / speeds[i] : need / speeds[i] + 1;
        }

        int cnt = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int prev = leadTime[0];
        for (int i=1; i<leadTime.length; i++) {
            if (prev < leadTime[i]) {
                list.add(cnt);
                cnt = 1;
                prev = leadTime[i];
            } else {
                cnt++;
            }
        }

        list.add(cnt);

        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
