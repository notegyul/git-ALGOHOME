package algo.september2024.week1;

// 240905 - 예상 대진표
public class ExpectedMatchups {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = (a+1) / 2;
            b = (b+1) / 2;
            answer++;
        }

        return answer;
    }


    // 잘못 생각한 코드
    public int wrongAnswer(int n, int a, int b) {
        int answer = 1;

        while (true) {
            a = a%2 == 1 ? (a+1) / 2 : a/2;
            b = b%2 == 1 ? (b+1) / 2 : b/2;
            answer++;

            if ((a-1) == b || (b-1) == a)
                break;
        }

        return answer;
    }
    // 처음부터 잘못된 생각으로 접근하면 모든 케이스 처리 못 한다고 지선생한테 혼남
}
