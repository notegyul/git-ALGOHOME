package algo.august2024.week3;

import java.util.Arrays;

import static java.util.Collections.sort;

// 240814 - 정수 내림차순 배치
public class DescendingNumber {
    public long solution(long n) {

        String st = Long.toString(n);
        int[] arr = new int[st.length()];

        for (int i=0; i<arr.length; i++) {
            // 숫자로 변환 (이제 아스키코드랑 좀 친해지자)
            arr[i] = st.charAt(i) - '0';
        }

        Arrays.sort(arr);

        /* 이거(String)는 안 될 수도 있음. 왜냐, 범위를 넘어섬
        String str = "";
        for (int i=arr.length-1; i>=0; i--) {
            str += arr[i];
        }

         */

        StringBuilder sb = new StringBuilder();
        for (int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]);
        }

        return Long.parseLong(sb.toString());
    }
}
