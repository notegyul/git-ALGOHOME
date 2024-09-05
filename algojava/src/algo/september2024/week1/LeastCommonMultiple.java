package algo.september2024.week1;

import java.util.HashSet;

// 240905 - N개의 최소공배수
public class LeastCommonMultiple {
    public int solution(int[] arr) {
        int answer = arr[0];

        // 공배수는 겹치는 수가 많아서 두 수씩 비교해 가며 반복 저장해 줌~
        for (int i=1; i<arr.length; i++) {
            answer = lcd(answer, arr[i]);
        }

        return answer;
    }

    // 유클리드 호재법(최대공약수)
    private int gcd(int a, int b) {
        if (a%b == 0)
            return b;

        return gcd(b, a%b);
    }

    // 두 수 a, b의 최소 공배수는 두 곱을 둘의 최대 공약수로 나눈 값
    private int lcd(int a, int b) {
        return (a*b) / gcd(a, b);
    }
}
