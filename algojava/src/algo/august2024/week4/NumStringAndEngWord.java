package algo.august2024.week4;

import java.util.HashMap;

// 240823 - 숫자 문자열과 영단어
public class NumStringAndEngWord {
    public int solution(String s) {

        HashMap<String, String> map = new HashMap<>();
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<=9; i++) {
            map.put(numStr[i], i+"");
        }

        StringBuilder sb = new StringBuilder();
        String tmp = "";
        for (char c : s.toCharArray()) {

            if (isInteger(c)) {
                sb.append(c);
            } else {
                tmp += c;
            }

            if (map.containsKey(tmp)) {
                sb.append(map.get(tmp));
                tmp = "";
            }
        }

        return Integer.parseInt(sb.toString());

    }


    private boolean isInteger(Character c) {
        try {
            Integer.parseInt(c.toString());
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }


    // 다른 사람의 놀라운 풀이법
    public int anotherSolution(String s) {
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i< numStr.length; i++) {
            s = s.replaceAll(numStr[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
