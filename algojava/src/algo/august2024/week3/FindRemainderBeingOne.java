package algo.august2024.week3;

// 240816 - 나머지가 1이 되는 수 찾기
public class FindRemainderBeingOne {
    public int solution(int n) {
        int ans = 1;

        while (ans <= n) {
            if (n % ans == 1)
                break;
            ans++;
        }

        return ans;
        // return InsStream.range(2,n).filter(i -> n%i == 1).findFirst().orElse(0);
    }
}
