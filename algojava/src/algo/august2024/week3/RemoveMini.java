package algo.august2024.week3;

import java.util.ArrayList;
import java.util.Arrays;

// 240817 - 제일 작은 수 제거하기
public class RemoveMini {
    public int[] solution(int[] arr) {

        if (arr.length == 1)
            return new int[]{-1};

        int mini = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }

        for (int num : arr) {
            if (num == mini)
                continue;
            list.add(num);
        }

        return list.stream()
                .mapToInt(Integer :: intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr);
    }
}
