package algo.august2024.week4;

// 240818 - 최대공약수와 최소공배수
public class GreatestAndLeast {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n,m);
        int min = Math.min(n,m);

        for (int i=1; i<=min; i++) {
            if (max % i == 0 && min % i == 0)
                answer[0] = i;
        }

        if (max % min == 0) {
            answer[1] = max;
            return answer;
        }

        int i = 1;
        while (true) {
            if ((max*i) % min == 0){
                answer[1] = max*i;
                break;
            }
            i++;
        }

        // answer[1] = (max * min) / answer[0];
        // 윗줄은 공식임. 어떤 두 수의 최소공배수는 두 수의 곱을, 두 수의 최대공약수로 나눈 값과 같다.

        return answer;
    }
}
