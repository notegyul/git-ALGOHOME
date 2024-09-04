package algo.september2024.week1;

// 240904 - 피보나치 수
public class FibonacciNumber {
    private int[] memo;
    public int solution(int n) {
        memo = new int[n+1];

        return f(n) % 1234567;
    }

    private int f(int n) {
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;
        if (memo[n] != 0)
            return memo[n];

        memo[n] = (f(n-1) + f(n-2)) % 1234567;

        return memo[n];
    }

    // 메모이제이션을 한번 써봤슈
}
