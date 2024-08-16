package algo.august2024.week3;

// 240816 - 약수의 합
public class SumOfDivisors {
    public int solution(int n) {

        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (n % i == 0)
                sum += i;
            i++;
        }

        return sum;
    }
}
