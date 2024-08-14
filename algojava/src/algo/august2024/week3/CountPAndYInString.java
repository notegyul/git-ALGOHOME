package algo.august2024.week3;

// 240814 - 문자열 내 p와 y의 개수
public class CountPAndYInString {
    boolean solution(String s) {

        int pCnt = 0;
        int yCnt = 0;

        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P')
                pCnt++;
            else if (c == 'y' || c == 'Y')
                yCnt++;
        }

        return yCnt == pCnt ? true : false;
    }


}
