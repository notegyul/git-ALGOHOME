package algo.september2024.week1;

// 240906 - n^2 배열 자르기
public class CuttingArray {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left + 1);
        int[] answer = new int[len];

        for (int i=0; i<len; i++) {
            answer[i] = (int) Math.max(left / n +1 , left % n + 1);
            left++;
        }

        return answer;
    }
    // 메모리 초과날 수 있으니 규칙 찾아 쉽게 가자
}
