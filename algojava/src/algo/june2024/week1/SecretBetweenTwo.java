package algo.june2024.week1;

import java.util.HashSet;
import java.util.Set;

// 240607 - 둘만의 암호
public class SecretBetweenTwo {

    public static void main(String[] args) {

    }

    public String solution(String s, String skip, int index) {
        StringBuffer answer = new StringBuffer();
        Set<Character> set = new HashSet<>();

        for (char c : skip.toCharArray()) {
            set.add(c);
        }

        for (char c : s.toCharArray()) {
            char newChar = c;
            int cnt = 0;

            while (cnt < index) {
                newChar = (char) ('a' + (newChar - 'a' + 1) % 26);
                if (!set.contains(newChar)) {
                    cnt++;
                }
            }

            answer.append(newChar);
        }



        return answer.toString();
    }
}
