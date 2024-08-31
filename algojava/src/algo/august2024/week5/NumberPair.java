package algo.august2024.week5;

// 240831 - 숫자 짝꿍
public class NumberPair {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        int[] xarr = new int[10];
        int[] yarr = new int[10];

        for (char c : X.toCharArray()) {
            xarr[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            yarr[c - '0']++;
        }

        for (int i=9; i>=0; i--) {
            int tmp = Math.min(xarr[i], yarr[i]);
            for (int j=0; j<tmp; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0)
            return "-1";

        if (sb.toString().replaceAll("0", "").length() == 0)
            return "0";

        return sb.toString();
    }

    // 늘 접근 방식은 틀리질 않네
    // 디테일이 안 돼서 힘들지
    // 그래서 더 어쩔어쩔어쩔어쩔어쩌라고~~
}
