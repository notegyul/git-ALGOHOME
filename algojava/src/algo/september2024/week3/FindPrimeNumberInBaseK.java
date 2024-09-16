package algo.september2024.week3;

// 240916 - k 진수에서 소수 개수 구하기
public class FindPrimeNumberInBaseK {
    public int solution(int n, int k) {
        int answer = 0;

        String[] nums = Integer.toString(n, k).split("0+");
        for (String num : nums) {
            if (isPrime(Long.parseLong(num)))
                answer++;
        }
        return answer;
    }


    // 소수 판별
    private boolean isPrime(long n) {
        if (n <= 1)
            return false;

        for (long i=2; i*i<=n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // 0 관련 조건 -> 잘 보면 진수를 0으로 split 해야 한다는 아이디어 캐치할 수 있음
}
