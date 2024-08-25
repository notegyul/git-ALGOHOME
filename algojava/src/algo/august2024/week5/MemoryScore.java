package algo.august2024.week5;

import java.util.HashMap;

// 240825 - 추억 점수
public class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int k=0; k<photo.length; k++) {
            String[] p = photo[k];
            int score = 0;
            for (int m=0; m<p.length; m++) {
                score += map.getOrDefault(p[m], 0);
            }

            answer[k] = score;
        }

        return answer;
    }

    // 참고: hashMap의 key 모임 구하기는 아래 참고
    // Set<Keytype> keys = map.keySet();  -> keys.contains(key)로 분기 처리 가능
}
