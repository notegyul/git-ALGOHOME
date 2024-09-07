package algo.september2024.week1;

// 240907 - 피로도
public class Fatigue {
    int[] v;
    public int solution(int k, int[][] dungeons) {

        v = new int[dungeons.length];
        return dfs(k, 0, dungeons);
    }


    private int dfs(int k, int cnt, int[][] dungeons) {
        int maxi = cnt;

        for (int i=0; i<dungeons.length; i++) {
            if (v[i] == 0 && k>=dungeons[i][0]) {
                v[i] = 1;
                maxi = Math.max(dfs(k-dungeons[i][1], cnt+1, dungeons), maxi);
                v[i] = 0;
            }
        }

        return maxi;
    }

    // DFS 공부 보충 좀 해야 할 듯~_~
}
