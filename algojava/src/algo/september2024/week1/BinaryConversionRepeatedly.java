package algo.september2024.week1;

import java.util.Stack;

// 240903 - 이진 변환 반복하기
public class BinaryConversionRepeatedly {
    public int[] solution(String s) {

        int[] result = new int[2];
        while (s.length() > 1) {
            // 제거된 0의 개수는 원본에서 "1"만 있는 개수를 뺀 값
            result[1] += s.length() - s.replace("0", "").length();
            int c = s.replace("0", "").length();
            s = Integer.toBinaryString(c);
            result[0]++;
        }

        return result;
    }

    // Integer.toBinaryString(int num) 이걸 몰랐네~~~
    // 이진 변환 직접 구현하다가 머리 터질 뻔~_~
}
