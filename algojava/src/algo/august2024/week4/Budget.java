package algo.august2024.week4;

import java.util.Arrays;

// 240820 - 예산
public class Budget {
    public int solution(int[] d, int budget) {

        int result = 0;
        // 재귀할 때도 오름차순 정렬 필수. 안 하면 불통
        Arrays.sort(d);

        for (int money : d) {
            if (budget > 0 && budget-money >= 0) {
                budget -= money;
                result++;
            }
        }

        return result;

        // return f(0, budget, 0, d);
    }

    // 굳이 재귀로 한번 해보자면 ? (쓸데없는 짓..)
    private int f(int k, int budget, int cnt, int[] d) {
        if (k > d.length-1 || budget - d[k] < 0)
            return cnt;

        return f(k+1, budget-d[k], cnt+1, d);
    }


}
