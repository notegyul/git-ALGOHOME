package algo.august2024.week3;

import java.util.ArrayList;
import java.util.Arrays;

// 240817 - 나누어 떨어지는 숫자 배열
public class DivisibleNumArray {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0)
                list.add(num);
        }

        if (list.size() == 0)
            return new int[]{-1};


        int[] result = list.stream()
                .mapToInt(Integer :: intValue)
                .toArray();

        Arrays.sort(result);
        return result;


        /*
        * int[] result = Arrays.stream(arr).filter(num -> num % divisor == 0).sorted().toArray();
        * if (result.length == 0 ) return new int[]{-1};
        * return result;
        * */
    }
}
