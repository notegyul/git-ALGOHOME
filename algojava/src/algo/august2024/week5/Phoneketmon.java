package algo.august2024.week5;

import java.util.HashSet;

// 240825 - 폰켓몬
public class Phoneketmon {

    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        if (set.size() >= nums.length/2) {
            return nums.length/2;
        }

        return set.size();
    }
}
