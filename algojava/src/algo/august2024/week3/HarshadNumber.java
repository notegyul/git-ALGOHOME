package algo.august2024.week3;

// 240816 - 하샤드 수
public class HarshadNumber {
    public boolean solution(int x) {
        int position = 0;
        for (char c: (x+"").toCharArray()) {
            position += (c - '0');
        }

        if (x % position == 0)  {
            return true;
        }

        return false;

        // return x % position == 0; 으로 하면 더 간단
        // (plus!!!) int sum = String.valueOf(x).chars.map(ch -> ch - '0').sum(); 하면 간단히 자릿수의 합 구할 수 있음
    }
}
