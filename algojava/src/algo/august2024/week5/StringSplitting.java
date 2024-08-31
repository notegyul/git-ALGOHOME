package algo.august2024.week5;

// 240830 - 문자열 나누기
public class StringSplitting {
    public int solution(String s) {
        int cnt = 0;
        int ans = 0;
        char first = s.charAt(0);

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            // 마지막 남는 한 덩어리는 여기서 자동 처리됨
            if (cnt == 0) {
                ans++;
                if (i < s.length()-1) {
                    first = s.charAt(i + 1);
                }
            }

            if (first == c) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return ans;
    }
}
