package algo.august2024.week3;

// 240817 - 약수의 개수와 덧셈
public class CntAndAdditionOfDivisor {
    public int solution(int left, int right) {
        int answer = 0;

        for (int num=left; num<=right; num++) {
            int cnt = 0;
            for (int i=1; i<=num; i++) {
                if (num % i == 0){
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }

        return answer;

        /**
         * 제곱수인 경우 약수의 개수는 홀수 -> 대부분의 수에 대해 약수는 짝수 개임
         *  그러나 제곱수(4^2 또는 6^2)가 존재하는 수의 약수는 홀수 개임
         *  if (num % Math.sqrt(num) == 0) {
         *      이 경우 제곱수가 존재하므로, 약수의 개수는 홀수 개가 되는 것
         *  }
         * */


    }
}
