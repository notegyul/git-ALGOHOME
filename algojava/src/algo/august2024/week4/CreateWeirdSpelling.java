package algo.august2024.week4;

// 240820 - 이상한 문자 만들기
public class CreateWeirdSpelling {
    public String solution(String s) {

        s = s.toLowerCase();
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            int flag = 0;
            if (arr[i].equals(" "))
                flag = 1;
        }

        return sb.toString();
    }
}
