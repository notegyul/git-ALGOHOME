package algo.august2024.week3;

// 240816 - 콜라츠 추측
public class CollatzConjecture {
    // 계산 중에 num이 21억을 넘는 경우가 있기 때문에 long으로 바꿔줌
    public int solution(long num) {
        int cnt = 0;
        if (num == 1)
            return 0;

        while (num != 1) {

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            cnt++;

            if (cnt == 500)
                return -1;
        }

        return cnt;
    }
}
