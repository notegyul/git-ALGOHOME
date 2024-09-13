package algo.september2024.week2;

// 240913 - 타겟 넘버
public class TargetNumber {
    int cnt;
    public int solution(int[] numbers, int target) {
        cnt = 0;
        dfs(0, 0, target, numbers);
        return cnt;
    }

    private void dfs(int k, int cur, int target, int[] nums) {
        if (k == nums.length) {
            if (cur == target) {
                cnt++;
                return;
            }
            return;
        }

        dfs(k+1, cur+nums[k], target, nums);
        dfs(k+1, cur-nums[k], target, nums);

    }

}
