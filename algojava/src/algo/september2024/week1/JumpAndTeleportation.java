package algo.september2024.week1;

// 240905- 점프와 순간이동
public class JumpAndTeleportation {
    public int solution(int n) {

        int answer = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                answer++;
            }
            n /= 2;
        }

        return answer;
    }

    // DFS로 풀어야 하나? 싶었지만 테케 5000 -> 5인 걸 보고
    // 최대한 (왔던 거리)*2를 많이 써서 n까지 가면 되겠군~ 생각함
    // 그래서 최대한 반으로 쪼갤 수 있는 지점인(반으로 나누어 떨어지는) 625까지만 DFS를 돌릴까 ? 또 생각했지만..
    // 밤새 생각했지만... 별로 좋은 방법은 아닌 듯했고.. 결국
    // 그냥 n이 홀수일 때마다 배터리를 1씩 사용하면 된다는 걸 알게 됨ㅋㅋ
}
