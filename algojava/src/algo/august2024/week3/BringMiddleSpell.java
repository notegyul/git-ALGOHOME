package algo.august2024.week3;

// 240817 - 가운데 글자 가져오기
public class BringMiddleSpell {
    public String solution(String s) {

        int len = s.length();
        char[] chars = s.toCharArray();
        if (len % 2 == 0) {
            return (chars[len/2 - 1] + "") + (chars[len/2] + "");
        }

        return chars[len/2] + "";

        // s.substring(len/2-1, (len/2)+1)      짝
        // s.substring(len/2, (len/2)+1)        홀
    }
}
