package algo.september2024.week1;

import java.util.Stack;

// 240903 - 올바른 괄호
public class ValidParentheses {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            }
        }

        if (!stack.isEmpty())
            return false;

        return true;
    }

}
