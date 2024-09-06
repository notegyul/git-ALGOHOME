package algo.september2024.week1;

import java.util.HashSet;

// 240906 - 연속 부분 수열 합의 개수
public class ConsecutiveSubarraySums {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int len = elements.length;

        for(int i=0; i<len; i++) {
            for (int j=0; j<len; j++) {
                int curSum = 0;
                for (int k=i; k<=(i+j); k++) {
                    curSum += elements[k%len];
                }
                set.add(curSum);
            }
        }

        return set.size();
    }
}
