package algo.july2024.week1;

import java.util.Stack;

// 240703 - 올바른 괄호
public class ValidParentheses {

    public static void main(String[] args) {

    }

    class Solution {
        public boolean solution(String s) {
            boolean answer = true;

            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

            if (!stack.isEmpty()) {
                answer = false;
            }

            return answer;
        }
    }
}
