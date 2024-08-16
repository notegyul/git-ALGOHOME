package algo.august2024.week3;

// x만큼 간격이 있는 n개의 숫자
public class CountingNumsIncreasingX {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i=0; i<answer.length; i++) {
            answer[i] = (long) x * (i+1);
        }
        return answer;
    }
}
