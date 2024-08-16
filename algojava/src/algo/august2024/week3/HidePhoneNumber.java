package algo.august2024.week3;

// 240817 - 핸드폰 번호 가리기
public class HidePhoneNumber {
    public String solution(String phone_number) {

        int len = phone_number.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<len-4; i++) {
            sb.append("*");
        }

        // sb.append(phone_number.substring(len-4, len));

        char[] chars = phone_number.toCharArray();
        for (int i=len-4; i<len; i++) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }
}
