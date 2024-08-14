package algo.august2024.week3;

// 240813 - 자릿수 더하기
public class PlusPositionNumber {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;

        // 드디어 스스로 디비전을...
    }
}
