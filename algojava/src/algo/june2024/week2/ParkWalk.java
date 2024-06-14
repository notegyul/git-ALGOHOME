package algo.june2024.week2;

public class ParkWalk {
    public static void main(String[] args) {
        String[] park = {"SOO", "OOO", "XXX"};
        String[] routes = {"E 2", "S 2", "W 1"};


    }

    // 240614 - 공원 산책
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        // 행의 수(세로) - park의 길이, 열의 후(가로) - park의 한 요소의 길이
        String[][] arr = new String[park.length][park[0].length()];
        for (int i=0; i<park.length; i++) {
            char[] tmp = park[i].toCharArray();     // tmp = ['S', 'O', 'O'] 이런 모양이 됨
            for (int j=0; j<park[i].length(); j++) {
                arr[i][j] = String.valueOf(tmp[j]);
                if (tmp[j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        int height = arr.length;
        int width = arr[0].length;

        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);

            int curX = answer[0];
            int curY = answer[1];

            // flag를 안 걸어 주면 현재 좌표 업데이트 시 문제가 생깁니다.
            boolean flag = true;

            // 범위 체크 && 장애물 체크 -> 특히 장애물은 지나가는 모든 길을 체크해야 함
            if (direction.equals("E")) {
                if (answer[1]+distance < width) {
                    for (int k=1; k<=distance; k++) {
                        if (arr[answer[0]][answer[1]+k].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        curY += distance;

                }
            } else if (direction.equals("W")) {
                if (answer[1]-distance >= 0) {
                    for (int k=1; k<=distance; k++) {
                        if (arr[answer[0]][answer[1]-k].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        curY -= distance;
                }
            } else if (direction.equals("S")) {
                if (answer[0] + distance < height) {
                    for (int k=1; k<=distance; k++) {
                        if (arr[answer[0]+k][answer[1]].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        curX += distance;
                }
            } else if (direction.equals("N")){
                if (answer[0]-distance >= 0) {
                    for (int k=1; k<=distance; k++) {
                        if (arr[answer[0]-k][answer[1]].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        curX -= distance;
                }
            }

            if (flag) {
                answer[0] = curX;
                answer[1] = curY;
            }

        }

        return answer;
    }
}
