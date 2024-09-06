package algo.september2024.week1;

import java.util.HashMap;

// 240906 - 의상
public class Costume {
    public int solution(String[][] clothes) {
        int answer = 1;

        int total = clothes.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        for (String k : map.keySet()) {
            answer *= (map.get(k) + 1);
        }

        return answer-1;
    }

    // 조합 문제
    // 각 카테고리 별 옷의 수 + 1 (여기서 1은 해당 카테고리에서 아무 것도 선택하지 않은 경우)
    // 모든 카테고리의 값을 곱해준 뒤
    // 아무 것도 선택하지 않은 경우 1 빼고 리턴~_~
}
