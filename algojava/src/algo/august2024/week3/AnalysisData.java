package algo.august2024.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// 240814 - 데이터 분석
public class AnalysisData {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int idx = 0;
        if (ext.equals("code")) {
            idx = 0;
        } else if (ext.equals("date")) {
            idx = 1;
        } else if (ext.equals("maximum")) {
            idx = 2;
        } else {
            idx = 3;
        }

        ArrayList<int[]> arr = new ArrayList<>();
        for (int[] dt : data) {
            if (dt[idx] > val_ext)
                continue;
            arr.add(dt);
        }

        if (sort_by.equals("code")) {
            idx = 0;
        } else if (sort_by.equals("date")) {
            idx = 1;
        } else if (sort_by.equals("maximum")) {
            idx = 2;
        } else {
            idx = 3;
        }

        /*
        * idx 더 간단하게 구하는 법 -> 아예 code, date, maximum, remain 으로 String[] 선언해두고 돌리면 더 명확한 풀이 가능
        *
        *   int idx = 0;
            int sortIdx = 0;
            for (int i=0; i<data[0].length; i++) {
                if (ext.equals(data[0][i]))
                    idx = i;
                if (sort_by.equals(data[0][i]))
                    sortIdx = i;
            }
        * */


        // 람다식에서 외부 변수 사용 시, 해당 변수는 final 이어야 함
        int finalIdx = idx;
        arr.sort((r1, r2) -> Integer.compare(r1[finalIdx], r2[finalIdx]));

        int row = arr.size();
        int col = data[0].length;
        int[][] answer = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr.get(i)[j];
            }


        }

        return answer;

    }
}
