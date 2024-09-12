package algo.september2024.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

// 240911 - 뉴스 클러스터링
public class NewsClustering {
    public int solution(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Integer> map1 = new HashMap<>();
        for (int i=0; i<str1.length()-1; i++) {
            String key = str1.substring(i, i+2);
            if (Pattern.matches("^[a-z]*$", key)) {
                map1.put(key, map1.getOrDefault(key, 0) + 1);
            }
        }

        Map<String, Integer> map2 = new HashMap<>();
        for (int i=0; i<str2.length()-1; i++) {
            String key = str2.substring(i, i+2);
            if (Pattern.matches("^[a-z]*$", key)) {
                map2.put(key, map2.getOrDefault(key, 0) + 1);
            }

        }

        // 교집합과 합집합
        float intersection = 0;
        float union = 0;

        for (String k : map1.keySet()) {
            if (map2.containsKey(k)) {
                intersection += Math.min(map1.get(k), map2.get(k));
                union += Math.max(map1.get(k), map2.get(k));
            } else {
                union += map1.get(k);
            }
        }

        for (String k : map2.keySet()) {
            if (!map1.containsKey(k)) {
                union += map2.get(k);
            }
        }


        if (union == 0)
            return 65536;

        return (int) ((intersection / union) * 65536);
    }
    // 아놔 문자열 전처리 잘못 해서 계속 통과 못하고 있었네
    // 어이 출타다 증말~~
}
