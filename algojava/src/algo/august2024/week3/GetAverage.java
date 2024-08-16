package algo.august2024.week3;

import java.util.Arrays;

// 240816 - 평균 구하기
public class GetAverage {
    public double solution(int[] arr) {

        int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        /*
        Arrays.stream(arr)
                .average()
                .orElse(0);

         */

        return (double) sum / arr.length;
    }
}
