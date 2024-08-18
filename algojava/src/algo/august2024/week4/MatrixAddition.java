package algo.august2024.week4;

// 240818 - 행렬의 덧셈
public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int row = arr1.length;
        int col = arr1[0].length;
        int[][] result = new int[row][col];
        // int[][] result = arr1; 로 하면 깔끔하지만.. 복사 문제로 인하여 arr1의 값도 함께 변하는 곤란한 점(원본 훼손)이 있다.

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }
}
