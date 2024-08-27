package algo.august2024.week5;

// 240827 - 소수 만들기
public class CreatingPrimeNumber {
    public int solution(int[] nums) {
        int ans = 0;
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int m=j+1; m<nums.length; m++) {
                    int tmp = nums[i] + nums[j] + nums[m];
                    int cnt = 0 ;
                    for (int k=1; k<=tmp; k++) {
                        if (tmp%k == 0) {
                            cnt++;
                        }
                        if (cnt > 2) {
                            continue;
                        }
                    }
                    if (cnt == 2)
                        ans++;
                }
            }
        }

        return ans;
    }


    // 약수 검증 로직 개선 -> 제곱근을 활용한다
    // 제곱근을 기준으로 약수는 대칭을 이룬다
    // 즉, 만약 소수라면 이때 약수로 카운팅되는 수가 1 하나여야 함
    // for (int i=1; i*i<=num; i++)
    //      if (num%i == 0) cnt++;

}
