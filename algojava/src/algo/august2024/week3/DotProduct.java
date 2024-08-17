package algo.august2024.week3;

// 240817 - 내적
public class DotProduct {
    public int solution(int[] a, int[] b) {
        int result = 0;
        for (int i=0; i<a.length; i++) {
            result += a[i] * b[i];
        }

        return result;

        // return IntStream.range(0, a.length).map(idx -> a[idx]*b[idx]).sum();
    }
}
