package algo.september2024.week1;

import java.util.Arrays;

// 240906 - HIndex
public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;

        Arrays.sort(citations);
        for (int i=0; i<len; i++) {
            if (citations[i] >= len-i)
                return len-i;
        }

        return answer;
    }
}
