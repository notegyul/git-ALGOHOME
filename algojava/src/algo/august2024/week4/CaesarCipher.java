package algo.august2024.week4;

import java.util.HashMap;

// 240822 - 시저 암호
public class CaesarCipher {
    public String solution(String s, int n) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> map = new HashMap<>();

        int k = 0;
        for (char c : alphabet.toCharArray()) {
            map.put(c, k);
            k++;
        }

        // "AB", "z", "a B z"
        StringBuilder sb  = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                sb.append(" ");
                continue;
            }

            int tmpIdx = 0;
            int idx = 0;
            if (Character.isUpperCase(c)) {
                tmpIdx = map.get(Character.toLowerCase(c));
                idx = (tmpIdx + n) % 26;
                sb.append(Character.toUpperCase(alphabet.charAt(idx)));
            } else {
                tmpIdx = map.get(c);
                idx = (tmpIdx + n) % 26;
                sb.append(alphabet.charAt(idx));
            }
        }

        return sb.toString();
    }

    public String otherSolution(String s, int n) {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                continue;
            }

            if (c >= 'a' && c <= 'z') {
                sb.append((char) ('a' + (c - 'a' + n) % 26));
            } else {
                sb.append((char) ('A' + (c - 'A' + n) % 26));
            }
        }

        return sb.toString();
    }
}
