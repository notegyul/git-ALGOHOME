package algo.august2024.week4;


import java.util.ArrayDeque;
import java.util.Deque;

// 240820 - 삼진법 뒤집기
public class ReverseBase3Notation {
    public int solution(int n) {

        Deque<Integer> dq = new ArrayDeque<>();
        while (n != 0) {
            dq.add(n % 3);
            n /= 3;
        }

        int result = 0;
        int curIdx = dq.size() - 1;
        while (dq.size() != 0) {
            result += dq.pollFirst() * (Math.pow(3, curIdx));
            curIdx--;
        }

        // Java의 제곱 계산: Math.pow(밑, 위)
        // 진수 변환: Integer.parseInt(n, 진법수)

        return result;
    }
}
