package algo.september2024.week1;

// 240903 - JadenCase 문자열 만들기
public class JadenCase {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] strs = s.split(" ");
        for (String str : strs) {
            if (str.equals(" ")) {
                sb.append(str);
                continue;
            }
            for (int i=0; i<str.length(); i++) {
                if (i==0) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(str.charAt(i)));
                }
            }
            sb.append(" ");
        }


        // 매개변수로 들어온 s가 공백으로 끝난다면 그대로 리턴
        if (s.endsWith(" ")) {
            return sb.toString();
        } else {    // 만약 아니라면 trim()으로 공백 제거 후 리턴
            return sb.toString().trim();
        }

    }

    /* 연속된 공백 문자("  ") 처리
    *   str.split("\\s+");
    * */
}
