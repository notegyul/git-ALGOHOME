package algo.september2024.week1;

import java.util.Arrays;

// 240903 - 최댓값과 최솟값
public class MaximunAndMinimum {
    public String solution(String s) {
        String answer = "";

        String[] sArr = s.split(" ");
        int[] nums = new int[sArr.length];
        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(sArr[i]);
        }

        Arrays.sort(nums);
        answer = nums[0] + " " + nums[nums.length-1];

        return answer;
    }
}
