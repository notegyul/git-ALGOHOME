package algo.september2024.week1;

import java.util.ArrayList;
import java.util.HashSet;

// 240907 - 캐시
public class Cache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if (cacheSize == 0)
            return 5 * cities.length;

        HashSet<String> set = new HashSet<>();
        ArrayList<String> cache = new ArrayList<>();

        for (int i=0; i<cities.length; i++) {
            String lower = cities[i].toLowerCase();
            if (set.contains(lower)) {
                answer++;
                cache.remove(lower);        // 지금 사용했으니 최신으로 갱신해 주려고 일단 삭제
            } else {
                set.add(lower);
                if (cache.size() == cacheSize){
                    set.remove(cache.get(0));
                    cache.remove(0);
                }
                answer += 5;
            }
            cache.add(lower);
        }

        return answer;
    }
}
