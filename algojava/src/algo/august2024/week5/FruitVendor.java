package algo.august2024.week5;

import java.util.Arrays;

// 240827 - 과일 장수
public class FruitVendor {
    public int solution(int k, int m, int[] score) {

        int ans = 0;
        int len = score.length-1;

        // 이익이 나지 않는 경우
        if (score.length < m)
            return 0;

        // 내림차순으로 반복 돌려서 한 박스당 최저 점수(p)를 최대한 높게 책정
        Arrays.sort(score);
        while (len >= m-1) {
            int idx = 0;
            idx = len - (m -1);
            ans += score[idx] * m;
            len -= m;
        }

        return ans;
    }

    // 더 간단하게 반복 돌릴 수도 있음
    // for (int i=score.length; i>=m; i-=m)



    /*   예전에 푼 코드
        * int answer = 0;
        // Integer[] 박싱 후 내림차순 정렬
        Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());

        for (int i=0; i<tmp.length / m; i++) {
            for (int j=i*m; j<i*m+m; j++) {
                if (j==i*m+m-1) {
                    int p = tmp[j];
                    answer += p * m;
                }
            }
        }

        return answer;
        *
        * */
}
