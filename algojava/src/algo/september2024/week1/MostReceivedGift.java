package algo.september2024.week1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

// 240902 - 가장 많이 받은 선물
public class MostReceivedGift {
    public int solution(String[] friends, String[] gifts) {

        // 선물 지수 map, 인덱스 map
        HashMap<String, Integer> giftIndex = new HashMap<>();
        HashMap<String, Integer> idxMap = new HashMap<>();

        // 선물 히스토리 이차원 배열
        int[][] history = new int[friends.length][friends.length];

        // 데이터 저장
        // 인덱스 map
        for (int i=0; i< friends.length; i++) {
            idxMap.put(friends[i], i);
        }

        // 선물지수 map, 선물 내역 데이터 저장
        for (String g : gifts) {
            String[] gift = g.split(" ");
            giftIndex.put(gift[0], giftIndex.getOrDefault(gift[0], 0) + 1);
            giftIndex.put(gift[1], giftIndex.getOrDefault(gift[1], 0) - 1);

            int row = idxMap.get(gift[0]);
            int col = idxMap.get(gift[1]);

            history[row][col]++;
        }

        int[] result = new int[friends.length];
        int answer = 0;
        for (int i=0; i<history.length; i++) {
            for (int j=0; j< history.length; j++) {
                if (i==j)
                    continue;

                // 선물을 주고 받은 적이 없거나, 횟수가 동일한 경우
                if (history[i][j] == history[j][i]) {

                    int giftIndexI = giftIndex.getOrDefault(friends[i], 0);
                    int giftIndexJ = giftIndex.getOrDefault(friends[j], 0);

                    if (giftIndexI == giftIndexJ)
                        continue;       // 선물 지수까지 동일한 경우 패스

                    if (giftIndexI > giftIndexJ) {
                        result[i]++;
                    }

                } else {
                    if (history[i][j] > history[j][i]) {
                        result[i]++;
                    }
                }
                answer = Math.max(answer, result[i]);
            }
        }

        return answer;
    }

    // 나 이 문제에 대해 할 말이 증말증말 많아
    // 테스트 케이스 두 개에서 런타임 에러가 자꾸 나는 거야~~~~ 오늘 하루종일 너무 스트레스 받았어~~~
    // 손으로 디버깅까지 했다.. 그래도 모르겠는 거야~~ 증말~~~~~ 너무 열 받아서 잠도 안 옴
    // 결국 지선생님을 찾아갔지
    // 지선생 말씀하시길, 특정 친구가 선물 기록에 전혀 나오지 않는 경우가 있을 수도 있다
    // 즉 누군가는 friends 배열엔 있으나, gifts 기록에 한 번도 등장하지 않을 수도 있다
    // 그래..... 그런 놈이 두 명 있었던 거야!!!!!!!
    // 그래서 gifts를 기반으로 만들어진 선물 지수 맵(giftIndex)에서 키를 찾지 못해 nullPointerException이 발생한 것이야
    // 그냥 런타임 에러라고만 뜨니까 당최 뭐가 문젠지 내가 알빠냐고~~~~
    // 아무튼 getOrDefault로 해결 봤다는 거임
    // 그 두 녀석.. ㅂㄷㅂㄷ... 핳 이제 자야징
}
