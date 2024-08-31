package algo.august2024.week5;

// 240831 - 이웃한 칸
public class NeighboringCell {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int[] dh = new int[]{-1, 0, 1, 0};
        int[] dw = new int[]{0, 1, 0, -1};

        int cnt = 0;
        for (int i=0; i<dh.length; i++) {
            int newH = dh[i] + h;
            int newW = dw[i] + w;
            if (isValid(newH, newW, n) && board[newH][newW].equals(board[h][w])) {
                cnt++;
            }
        }

        return cnt;
    }

    private boolean isValid(int a, int b, int n) {
        return (a>=0 && a<n) && (b>=0 && b<n);
    }

    // 찰싹찰싹 파리 잡기
}
