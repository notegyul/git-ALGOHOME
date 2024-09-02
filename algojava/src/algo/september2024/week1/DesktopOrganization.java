package algo.september2024.week1;

// 240902 - 바탕화면 정리
public class DesktopOrganization {
    public int[] solution(String[] wallpaper) {
        int[] answer = {-1, -1, -1, -1};

        int row = wallpaper.length;
        int col = wallpaper[0].length();

        Character[][] walls =  new Character[row][col];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                walls[i][j] = wallpaper[i].charAt(j);
            }
        }

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (walls[i][j] == '#') {
                    answer[0] = i;
                    break;
                }
            }

            if (answer[0] != -1)
                break;
        }

        for (int j=0; j<col; j++) {
            for (int i=0; i<row; i++) {
                if (walls[i][j] == '#') {
                    answer[1] = j;
                    break;
                }
            }

            if (answer[1] != -1)
                break;
        }

        for (int i=row-1; i>=0; i--) {
            for (int j=col-1; j>=0; j--) {
                if (walls[i][j] == '#') {
                    answer[2] = i+1;
                    break;
                }
            }

            if (answer[2] != -1)
                break;
        }

        for (int j=col-1; j>=0; j--) {
            for (int i=row-1; i>=0; i--) {
                if (walls[i][j] == '#'){
                    answer[3] =j+1;
                    break;
                }
            }

            if (answer[3] != -1)
                break;
        }

        return answer;
    }       // 비효율의 끝판왕이다. 어떠냐.


    // 제대로 푼 코드 ㅋㅋ
    public int[] otherSolution(String[] wallpaper) {
        int[] answer = {55, 55, -1, -1};

        int row = wallpaper.length;;
        int col = wallpaper[0].length();

        for(int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i+1);
                    answer[3] = Math.max(answer[3], j+1);
                }
            }
        }

        return answer;
    }
}
