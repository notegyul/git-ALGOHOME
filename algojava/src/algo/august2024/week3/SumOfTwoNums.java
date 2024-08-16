package algo.august2024.week3;

// 240816 - 두 정수의 합
public class SumOfTwoNums {
    public long solution(int a, int b) {
        long answer = 0;

        if (a == b)
            return a;

        int start = a < b ? a : b;
        int end = a < b ? b : a;

        long result = 0;
        while (start <= end) {
            result += start;
            start++;
        }

        return result;

    }

    // Java 절대값 함수 : Math.abs(n) <- 매개변수로 들어가는 타입별로 리턴해줌
}
