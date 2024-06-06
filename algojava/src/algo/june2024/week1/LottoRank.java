package algo.june2024.week1;


public class LottoRank {
    public static void main(String[] args) {


    }

    // 240606
    public int[] solution(int[] lottos, int[] winNums) {

        int zero = 0;
        int matchCnt = 0 ;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
            } else {
                for (int win : winNums) {
                    if (lotto == win) {
                        matchCnt++;
                        break;
                    }
                }
            }
        }


        int maxi = matchCnt + zero;
        int mini = matchCnt;

        int[] answer = {Math.min(7-maxi, 6), Math.min(7-mini, 6)};
        return answer;
    }
}
