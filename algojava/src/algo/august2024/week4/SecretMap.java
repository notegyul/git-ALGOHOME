package algo.august2024.week4;

// 240824 - 비밀지도
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] tmpArr1 = f(n, arr1);
        int[][] tmpArr2 = f(n, arr2);

        for (int i=0; i<n; i++) {
            String tmp = "";
            for (int j=0; j<n; j++) {
                if (tmpArr1[i][j] + tmpArr2[i][j] > 0) {
                    tmp += "#";
                } else {
                    tmp += " ";
                }
            }

            answer[i] = tmp;
        }

        return answer;
    }


    private int[][] f(int n, int[] arr) {

        int[][] result = new int[n][n];
        for (int i=0; i<n; i++) {
            int k = n-1;
            int spot = arr[i];

            while (spot != 0) {
                result[i][k] = spot % 2;
                spot /= 2;
                k--;
            }
        }

        return result;
    }


    /* 비트연산을 이용한 훨~ 간단한 방식
    *
    * for (int i = 0; i < n; i++) {
        // 두 배열의 요소를 비트 OR 연산
        int combined = arr1[i] | arr2[i];
        // 이진수 문자열로 변환
        StringBuilder tmp = new StringBuilder();

        for (int j = n - 1; j >= 0; j--) {
            // 1이면 '#', 0이면 ' '을 추가
            if ((combined & (1 << j)) != 0) {
                tmp.append("#");
            } else {
                tmp.append(" ");
            }
        }
        answer[i] = tmp.toString();
    }
    *
    * */
}
