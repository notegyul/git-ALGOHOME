package algo.august2024.week5;

import java.util.HashMap;

// 240825 - 2016년(윤년 문제)
public class LeapYear {
    public String solution(int a, int b) {

        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] monthDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int idx = b;

        for (int i=0; i<a-1; i++) {
            idx += monthDay[i];
        }

        idx %= 7;

        return days[idx];
    }
}
