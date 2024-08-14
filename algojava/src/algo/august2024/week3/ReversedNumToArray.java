package algo.august2024.week3;

import java.util.ArrayList;
import java.util.Arrays;

// 240814 - 자연수 뒤집어 배열로 만들기
public class ReversedNumToArray {
    public int[] solution(long n) {

        int[] ans = new int[String.valueOf(n).length()];
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add((int) n % 10);
            n /= 10;
        }

        for (int i=0; i<arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;

        // 테케 3개 불통 왜임?
    }
}
