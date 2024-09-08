package algo.september2024.week2;

import java.util.*;
import java.util.Queue;

// 240908 - 프로세스
public class Process {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 내림차순으로 우선순위 큐 만듦
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            pq.offer(priority);
        }

        while (!pq.isEmpty()) {
            for (int i=0; i< priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;
                    if (location == i)
                        return answer;
                }
            }
        }

        return answer;
    }
}
