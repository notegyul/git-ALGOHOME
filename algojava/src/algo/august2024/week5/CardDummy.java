package algo.august2024.week5;

import java.util.LinkedList;
import java.util.Queue;

// 240825 - 카드 뭉치
public class CardDummy {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> que1 = new LinkedList<>();
        Queue<String> que2 = new LinkedList<>();
        for (String card : cards1) {
            que1.offer(card);
        }

        for (String card : cards2) {
            que2.offer(card);
        }

        for (String g : goal) {
            if (!g.equals(que1.peek()) && !g.equals(que2.peek())) {
                return "No";
            }

            if (g.equals(que1.peek())) {
                que1.poll();
            } else {
                que2.poll();
            }

        }

        return "Yes";
    }

    // 자료구조 좋아~
}
