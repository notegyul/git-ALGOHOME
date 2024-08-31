package algo.august2024.week5;

import java.util.Stack;

// 240831 - 크레인 인형 뽑기 게임
public class PickADollGame {
    public int solution(int[][] board, int[] moves) {
        int cnt = 0;

        Stack<Integer> stack = new Stack<>();
        for (int x : moves) {
            for (int i=0; i<board.length; i++) {
                if (board[i][x-1] != 0) {
                    int doll = board[i][x-1];
                    board[i][x-1] = 0;

                    if (stack.size() >=1 && stack.peek() == doll) {
                        cnt += 2;
                        stack.pop();
                    } else {
                        stack.push(doll);
                    }

                    break;
                }
            }
        }

        return cnt;
    }

}
