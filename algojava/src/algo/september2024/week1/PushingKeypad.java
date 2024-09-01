package algo.september2024.week1;

import java.util.HashMap;

// 240901 - 키패드 누르기
public class PushingKeypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        // 왼,오의 현재 위치 좌표
        int[] curLeft = {3,0};
        int[] curRight = {3,2};
        int[] center = {-1, 1};

        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                sb.append("L");
                curLeft[1] = 0;
                switch(n) {
                    case 1:
                        curLeft[0] = 0;
                        break;
                    case 4:
                        curLeft[0] = 1;
                        break;
                    case 7:
                        curLeft[0] = 2;
                        break;
                }
            } else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                curRight[1] = 2;
                switch(n) {
                    case 3:
                        curRight[0] = 0;
                        break;
                    case 6:
                        curRight[0] = 1;
                        break;
                    case 9:
                        curRight[0] = 2;
                        break;
                }
            } else {
                switch(n) {
                    case 2:
                        center[0] = 0;
                        break;
                    case 5:
                        center[0] = 1;
                        break;
                    case 8:
                        center[0] = 2;
                        break;
                    case 0:
                        center[0] = 3;
                        break;
                }

                int left = Math.abs((curLeft[0] - center[0])) + Math.abs((curLeft[1] - center[1]));
                int right = Math.abs((curRight[0] - center[0])) + Math.abs((curRight[1] - center[1]));

                String tmp = "";
                if (left == right) {
                    if (hand.equals("left")) {
                        tmp = "L";
                        curLeft[0] = center[0];
                        curLeft[1] = center[1];
                    }else {
                        tmp = "R";
                        curRight[0] = center[0];
                        curRight[1] = center[1];
                    }
                } else if (left < right) {
                    tmp = "L";
                    curLeft[0] = center[0];
                    curLeft[1] = center[1];
                } else {
                    tmp = "R";
                    curRight[0] = center[0];
                    curRight[1] = center[1];
                }

                sb.append(tmp);
            }
        }

        return sb.toString();
    }

    // 급하게 풀어서 의식의 흐름 대로 쓰긴 했는데 애초에 이차원 배열로 좌표를 심어 놓고 풀면 훨씬 간결해짐
    /*
    * int[][] positions = {
        {3, 1}, // 0
        {0, 0}, // 1
        {0, 1}, // 2
        {0, 2}, // 3
        {1, 0}, // 4
        {1, 1}, // 5
        {1, 2}, // 6
        {2, 0}, // 7
        {2, 1}, // 8
        {2, 2}  // 9
};
    * */
}
