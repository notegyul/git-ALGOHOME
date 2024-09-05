package algo.september2024.week1;

// 240905 - 멀리 뛰기
public class LongJump {
    public long solution(int n) {
        long answer = 0;

        // n이 1인 경우도 있음
        long[] dp = new long[n+2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }

        return dp[n];
    }

    // 피보나치 수열
}
