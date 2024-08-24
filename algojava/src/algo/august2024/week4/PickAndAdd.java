package algo.august2024.week4;

import java.util.Arrays;
import java.util.HashSet;

// 240823 - 두 개 뽑아서 더하기
public class PickAndAdd {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int n : set) {
            result[i++] = n;
        }

        Arrays.sort(result);

        return result;
    }
}
