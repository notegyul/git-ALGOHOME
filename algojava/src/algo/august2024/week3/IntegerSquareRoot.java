package algo.august2024.week3;

// 250816 - 정수 제곱근 판별
public class IntegerSquareRoot {
    public long solution(long n) {
        // 제곱근을 구하는 함수: Math.sqrt()
        long sq = (long) Math.sqrt(n);
        if (sq*sq == n) {
            return (sq+1)*(sq+1);
        }
        return -1;
    }
}
