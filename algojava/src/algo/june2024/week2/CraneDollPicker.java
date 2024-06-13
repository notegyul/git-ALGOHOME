package algo.june2024.week2;

import java.util.Stack;

public class CraneDollPicker {

    public static void main(String[] args) {

    }

    // 240613 - 크레인 인형 뽑기
    public int solution(int[][] board, int[] moves) {

        // 1. moves 배열 탐색 반복
        // 2. moves의 원소는 이차원배열의 열 자리
        // 3. 2번 열 자리 반복 돌려서 0이 아닌 행 찾기
        // 4. 0이 아닌 값이 나오면 스택에 해당 값을 넣어 주고, 이차원배열의 해당 자리는 0으로
        // 5. 스택에서 같은 인형 두 개가 쌓이면 터뜨리고 cnt+=2

        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for (int m : moves) {
            for (int i=0; i<board[m-1].length; i++) {
                if (board[i][m-1] != 0) {
                    int doll = board[i][m-1];
                    board[i][m-1] = 0;

                    // 스택이 비어 있지 않고 && 꼭대기 원소와 현재 doll이 같은 경우 터뜨려
                    if (!stack.empty() && stack.peek() == doll) {
                        stack.pop();
                        cnt += 2;
                    } else {
                        stack.push(doll);
                    }
                    // 인형 하나 뽑았으면 다음 m으로 이동
                    break;
                }
            }
        }

        return cnt;
    }

}
