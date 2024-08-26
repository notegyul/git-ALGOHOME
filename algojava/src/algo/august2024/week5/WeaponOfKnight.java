package algo.august2024.week5;

// 240826 - 기사단원의 무기
public class WeaponOfKnight {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i=1; i<=number; i++) {
            int cnt = 0;
            for (int j=1; j*j<=i; j++) {
                // 제곱수일 경우 약수는 하나
                if (j*j == i) {
                    cnt++;
                    // 제곱수 아닐 경우 짝꿍이 있으므로 +2
                } else if (i%j == 0) {
                    cnt += 2;
                }
            }
            if (cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }

        return answer;
    }

    // 제곱수를 기준으로 약수들은 항상 짝꿍을 이룬다.
}
