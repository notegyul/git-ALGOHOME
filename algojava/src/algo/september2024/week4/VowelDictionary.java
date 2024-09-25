package algo.september2024.week4;

import java.util.Set;
import java.util.TreeSet;

// 240925 - 모음 사전
public class VowelDictionary {
    Set<String> set;
    String[] vowels = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        set = new TreeSet<>();
        for (int i=0; i<vowels.length; i++) {
            vowel(vowels[i], 1);
        }

        int cnt = 0;
        for (String s : set) {
            cnt++;
            if (s.equals(word))
                return cnt;
        }

        return 0;
    }

    private void vowel(String base, int depth) {

        set.add(base);
        if (depth == 5)
            return;

        for (int i=0; i<5; i++) {
            vowel(base + vowels[i], depth+1);
        }

    }
}
