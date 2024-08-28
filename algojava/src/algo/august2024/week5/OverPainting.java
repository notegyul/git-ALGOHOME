package algo.august2024.week5;

// 240827 - 덧칠하기 (그리디)
public class OverPainting {
    public int solution(int n, int m, int[] section) {
        int cnt = 1;

        // section의 첫 번째 요소부터 칠하기 시작
        int start = section[0];
        int end = start + m - 1;

        // section을 순회하며, 요소가 start~end 사이에 들어간다면 칠하고
        for (int num : section) {
            if (num <= end) {
                continue;
            } else {  // 그렇지 않다면 start와 end를 재정의
                start = num;
                end = start + m - 1;
                cnt++;
            }

        }
        return cnt;
    }

    // 중간에 통으로 안 칠해도 되는 구간이 나올 수 있으므로
    // start 재정의를 num으로 해준다
    // 처음엔 기존 end 지점에서 +1로 재정의했더니, 테케 몇 개 실패했음
}
