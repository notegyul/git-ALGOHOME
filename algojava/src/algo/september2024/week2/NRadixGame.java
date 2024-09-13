package algo.september2024.week2;

// 240913 - n 진수 게임
public class NRadixGame {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<t*m; i++) {
            sb.append(Integer.toString(i, n));
        }

        p -= 1;
        String answer = "";
        while (t != 0) {
            answer += sb.charAt(p);
            p += m;
            t--;
        }

        return answer.toUpperCase();
    }

    // Integer.toString(int i, int radix)
}
