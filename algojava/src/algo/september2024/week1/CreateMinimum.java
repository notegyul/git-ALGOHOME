package algo.september2024.week1;

import java.util.Arrays;

// 240903 - 최솟값 만들기
public class CreateMinimum {
    public int solution(int[] A, int[] B) {

        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        int len = A.length;
        for (int i=0; i<len; i++) {
            sum += A[i] * B[len-1-i];
        }

        return sum;
    }
    // 간단간단~~ 내심 DFS로 한번 풀어 보고 싶었지만
    // 다 까먹음 ㅎㅎ
}
