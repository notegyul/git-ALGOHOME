package algo.june2024.week1;

import java.util.HashMap;

public class CaesarCipher {
    public static void main(String[] args) {
        CaesarCipher c = new CaesarCipher();
        System.out.println(c.solution("AB", 1));
        System.out.println(c.newSolution("Z", 1));
    }

    public String solution(String s, int n) {
        String answer = "";

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] upCharArr = upper.toCharArray();
        char[] lowCharArr = upper.toLowerCase().toCharArray();

        HashMap<Character, Integer> hmUpper = new HashMap<>();
        HashMap<Character, Integer> hmLower = new HashMap<>();
        for (int i=0; i<upper.length(); i++) {
            hmUpper.put(upCharArr[i], i);
            hmLower.put(lowCharArr[i], i);
        }

        char[] sChar = s.toCharArray();
        int index = 0;
        for (char c : sChar) {
            String tmp = "";

            // 단일 문자(char)는 작은 따옴표를 쓴다
            if (c == ' ') {
                tmp = " ";
                answer += tmp;
                continue;
            }


            if (Character.isUpperCase(c)) {
                index = (hmUpper.get(c) + n) % 26;
                tmp = upCharArr[index]+"";

            } else {
                index = (hmLower.get(c) + n) % 26;
                tmp = lowCharArr[index]+"";
            }

            answer += tmp;
        }

        return answer;
    }

    public String newSolution(String s, int n) {
        StringBuffer answer = new StringBuffer();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
            } else if (Character.isUpperCase(c)) {
                answer.append((char) ('A' + (c - 'A' + n) % 26));
            } else if (Character.isLowerCase(c)) {
                answer.append((char) ('a' + (c - 'a' + n) % 26));
            }
        }

        return answer.toString();
    }
}
