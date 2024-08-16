package algo.august2024.week3;

// 240816 - 음양 더하기
public class PlusMinus {
    public int solution(int[] absolutes, boolean[] signs) {
        int result = 0;
        for (int i=0; i<absolutes.length; i++) {
            int tmp = signs[i] ? absolutes[i] : -absolutes[i];
            result += tmp;
        }

        return result;
    }
}
