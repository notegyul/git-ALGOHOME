package algo.june2024.week1;

import java.util.Arrays;
import java.util.Collections;

public class FruitSeller {

    public static void main(String[] args) {

    }

    // 20240604 - 과일 장수
    public int solution(int k, int m, int[] score) {

        int answer = 0;
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

        // 문제를 제대로 안 읽어서 사과 한 상자의 가격이 p*m인 걸 간과하고 반복 돌 때마다 answer에 다 더해버려서 오답이었음
        return answer;

    }
}
