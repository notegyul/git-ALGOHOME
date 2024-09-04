package algo.september2024.week1;

// 240904 - 다음 큰 숫자
public class TheNextBigNumber {
    public int solution(int n) {

        String standard = Integer.toBinaryString(n);
        int len = standard.replace("0", "").length();
        int next = n+1;

        boolean flag = true;
        while (flag) {
            String bin = Integer.toBinaryString(next);
            if (bin.replace("0", "").length() == len) {
                return next;
            }
            next++;
        }

        return 0;
    }
}
