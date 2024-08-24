package algo.august2024.week4;

import java.util.Arrays;

// 240824 - 문자열 내 마음대로 정렬하기
public class SortingStringAsIWant {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            }

            return s1.charAt(n) - s2.charAt(n);
        });

        return strings;
    }



}
