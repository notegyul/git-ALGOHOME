package algo.august2024.week4;

// 240818 - 문자열 다루기 기본
public class HandleStringBasic {
    public boolean solution(String s) {

        if (!checkLength(s))
            return false;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if ((c - '0') > 9)
                return false;
        }

        return true;
    }

    private boolean checkLength(String s) {
        return s.length() == 4 || s.length() == 6;
    }

}
