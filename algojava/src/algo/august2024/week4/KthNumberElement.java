package algo.august2024.week4;

import java.util.Arrays;

// 240822 - K번째 수
public class KthNumberElement {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int ansIdx = 0;

        for (int[] command : commands) {
            int i = command[0] - 1;
            int j = command[1] - 1;
            int k = command[2] - 1;

            int[] tmpArr = new int[j-i+1];
            int idx = 0;
            for (int m=i; m<=j; m++) {
                tmpArr[idx] = array[m];
                idx++;
            }

            Arrays.sort(tmpArr);
            answer[ansIdx] = tmpArr[k];
            ansIdx++;
        }

        return answer;
    }
}
