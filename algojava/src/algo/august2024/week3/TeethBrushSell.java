package algo.august2024.week3;

import java.util.HashMap;

// 240811 - 다단계 칫솔 판매
public class TeethBrushSell {


    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {


        // 추천인 저장 해시맵
        HashMap<String, String> recommend = new HashMap<>();
        // 최종 수익금 결과 저장 해시맵
        HashMap<String, Integer> resultMap = new HashMap<>();
        for (int i=0; i< enroll.length; i++) {
            recommend.put(enroll[i], referral[i]);
            resultMap.put(enroll[i], 0);
        }

        /*  밑에서 curName이 반복마다 (while 안에서) 갱신돼서 이렇게 하면 안 됨.
        // 판매자와 수익금 해시맵
        HashMap<String, Integer> sellMap = new HashMap<>();
        for (int i=0; i<seller.length; i++) {
            sellMap.put(seller[i], amount[i]*100);
        }

         */


        for (int k=0; k< seller.length; k++) {

            String curName = seller[k];

            int money = amount[k] * 100;
            while (!(curName.equals("-")) && money > 0) {
                resultMap.put(curName, resultMap.get(curName) + money - (money/10));
                curName = recommend.get(curName);
                money /= 10;
            }
        }

        int[] answer = new int[enroll.length];
        for (int i=0; i< answer.length; i++) {
            answer[i] = resultMap.get(enroll[i]);
        }

        return answer;
    }
}
