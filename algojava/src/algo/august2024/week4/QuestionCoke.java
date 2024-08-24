package algo.august2024.week4;

// 240824 - 콜라 문제
public class QuestionCoke {
    public int solution(int a, int b, int n) {
        int result = 0;

        while ( n >= a) {
            result += (n/a)*b;
            n = (n/a) * b + (n%a);
        }

        return result;
    }
}
