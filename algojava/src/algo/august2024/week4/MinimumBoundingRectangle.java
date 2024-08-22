package algo.august2024.week4;

// 240822 - 최소직사각형
public class MinimumBoundingRectangle {
    public int solution(int[][] sizes) {

        int w = 0;
        int h = 0;

        for (int[] size : sizes) {
            int maxi = Math.max(size[0], size[1]);
            int mini = Math.min(size[0], size[1]);

            w = Math.max(w, maxi);
            h = Math.max(h, mini);

        }

        return w*h;
    }
}
