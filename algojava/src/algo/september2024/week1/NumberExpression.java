package algo.september2024.week1;

// 240903 - 숫자의 표현
public class NumberExpression {
    public int solution(int n) {
        int cnt = 0;

        for (int start=1; start<=n; start++) {
            int sum = 0;
            for (int k=start; k<=n; k++) {
                sum += k;
                if (sum == n) {
                    cnt++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }

        return cnt;
    }
    //
}
