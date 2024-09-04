package algo.september2024.week1;

import java.util.Stack;

// 240904 - 짝지어 제거하기
public class RemovePairs {
    public int solution(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (!stack.isEmpty()) {
                if (s.charAt(i) == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (!stack.isEmpty())
            return 0;
        return 1;
    }
}
