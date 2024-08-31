package algo.august2024.week5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// 240831 - 둘만의 암호
public class SecretCodeBetweenUs {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();

        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }

        for (char c : s.toCharArray()) {
            char cur = c;
            int count = 0;
            while (count < index) {
                cur = (char) ((cur - 'a' + 1) % 26 + 'a');
                if (!skipSet.contains(cur)) {
                    count++;
                }
            }
            answer.append(cur);
        }

        return answer.toString();

    }

}
