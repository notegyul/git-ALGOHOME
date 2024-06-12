package algo.june2024.week2;

import java.util.Stack;

public class BurgerBuilder {

    public static void main(String[] args) {

    }

    // 240612 - 햄버거 만들기
    public class Solution {
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
}
