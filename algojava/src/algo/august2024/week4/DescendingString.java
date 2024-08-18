package algo.august2024.week4;

import java.util.Arrays;
import java.util.Collections;

// 240818 - 문자열 내림차순으로 배치하기
public class DescendingString {
    public String solution(String s) {

        char[] chars = s.toCharArray();
        int[] tmp = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            tmp[i] = chars[i] - '0';
        }

        Arrays.sort(tmp);
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--) {
            sb.append((char)(tmp[i] + '0'));
        }

        return sb.toString();
    }

    public String otherSolution (String s) {
        Character[] chars = new Character[s.length()];
        for (int i=0; i<s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        // 내림차순 정렬
        Arrays.sort(chars, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }
}
