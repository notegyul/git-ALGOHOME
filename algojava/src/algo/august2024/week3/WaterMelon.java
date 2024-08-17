package algo.august2024.week3;

// 240817 - 수박수박수박수박수
public class WaterMelon {
    public String solution(int n) {

        String s = "수박";
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n/2; i++) {
            sb.append(s);
        }

        if (n % 2 == 0) {
            return sb.toString();
        }

        sb.append("수");
        return sb.toString();
    }
}
