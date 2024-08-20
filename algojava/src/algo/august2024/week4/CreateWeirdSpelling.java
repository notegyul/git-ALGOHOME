package algo.august2024.week4;

// 240820 - 이상한 문자 만들기
public class CreateWeirdSpelling {
    public String solution(String s) {

        s = s.toLowerCase();
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (String str : arr) {
            if (str.equals(" ")) {
                sb.append(str);
                cnt = 0;
                continue;
            }

            for (int i=0; i<str.length(); i++) {
                if (cnt % 2 == 0) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                    cnt++;
                } else {
                    sb.append(Character.toLowerCase(str.charAt(i)));
                    cnt++;
                }
            }

        }

        return sb.toString();
    }
}
