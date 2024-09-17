package algo.september2024.week3;

import java.util.LinkedList;
import java.util.Queue;

// 240917 - 게임 맵 최단거리
public class ShortestPathInAGameMap {
    public int solution(int[][] maps) {
        int targetRow = maps.length-1;
        int targetCol = maps[0].length-1;

        int[][] deltas = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int[][] visited = new int[maps.length][maps[0].length];

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,1});
        visited[0][0] = 1;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int row = current[0];
            int col = current[1];
            int cnt = current[2];

            if (row == targetRow && col == targetCol)
                return cnt;

            for (int[] delta : deltas) {
                int newRow = row + delta[0];
                int newCol = col + delta[1];

                if ((newRow >= 0 && newRow < maps.length) && (newCol >= 0 && newCol < maps[0].length)) {
                    if (maps[newRow][newCol] == 1 && visited[newRow][newCol] == 0) {
                        q.offer(new int[]{newRow, newCol, cnt + 1});
                        visited[newRow][newCol] = 1;
                    }
                }
            }
        }

        return -1;

    }

}
