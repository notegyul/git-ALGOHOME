package algo.september2024.week2;

import java.util.Arrays;
import java.util.HashSet;

// 240908 - 튜플
public class Tuple {
    public int[] solution(String s) {

        s = s.replace("{", "");
        s = s.replace("},", "|");
        s = s.replace("}}", "");
        String[] strArr = s.split("\\|");

        HashSet<Integer> set = new HashSet<>();

        // 배열 길이 오름차순 정렬
        Arrays.sort(strArr, (s1, s2) -> s1.length() - s2.length());
        int[] answer = new int[strArr.length];

        int idx = 0;
        for (String str : strArr) {
            String [] arr = str.split(",");
            for (String st : arr) {
                int num = Integer.parseInt(st);
                if (!set.contains(num)) {
                    set.add(num);
                    answer[idx] = num;
                    idx++;
                }
            }
        }

        return answer;
    }

    // 문자열 문제 너무 힘들어
}
