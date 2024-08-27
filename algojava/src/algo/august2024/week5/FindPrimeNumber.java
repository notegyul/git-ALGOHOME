package algo.august2024.week5;

import java.util.Arrays;

// 240827 - 소수 찾기: 에라토스테네스의 체 그게 먼데~~~~~~~ 나 너무 괴로워
public class FindPrimeNumber {
    public int solution(int n) {

        int answer = 0;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        // 소수가 아닌 것들: 0, 1
        isPrime[0] = isPrime[1] = false;

        for (int i=2; i*i<=n; i++) {
            if (isPrime[i]) {
                for (int j=i*i; j<=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i=2; i<=n; i++) {
            if (isPrime[i])
                answer++;
        }

        return answer;
    }
    // 에라토스테네스씨는 말씀하셨지
    // 네가 현재 소수거든,
    // 너의 배수는 모두 소수가 아니게 되리라
}
