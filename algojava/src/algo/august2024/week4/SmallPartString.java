package algo.august2024.week4;

//  240820 - 크기가 작은 부분 문자열
public class SmallPartString {
    public int solution(String t, String p) {
        int result = 0;

        int range = t.length() - p.length();
        long pNum = Long.parseLong(p);

        for (int i=0; i<=range; i++) {
            StringBuilder sb = new StringBuilder();
            // String subStr = t.substring(i, i+p.length()) 로 문자열 t에서 직접 추출
            for (int j=0; j<p.length(); j++) {
                sb.append(t.charAt(j+i));
            }

            /* 숫자가 너무 커질 경우 Integer.parseInt()로 처리 불가능!
            int tNum = Integer.parseInt(sb.toString());
            if (!(tNum > pNum))
                result++;
             */

            long tNum = Long.parseLong(sb.toString());
            if (tNum > pNum)
                continue;

            result++;

        }

        return result;
    }
}
