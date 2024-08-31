package algo.august2024.week5;

import java.util.Stack;

// 240831 - 햄버거 만들기
public class Hamburger {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 1) == 1 &&
                        stack.get(size - 2) == 3 &&
                        stack.get(size - 3) == 2 &&
                        stack.get(size - 4) == 1) {
                    // 순서가 맞으면 스택에서 제거 (포장)
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }

        return answer;
    }
}
