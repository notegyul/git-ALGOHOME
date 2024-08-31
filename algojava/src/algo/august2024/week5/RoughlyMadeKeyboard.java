package algo.august2024.week5;

import java.util.HashMap;

// 240831 - 대충 만든 자판
public class RoughlyMadeKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> map = new HashMap<>();
        for (String keys : keymap) {
            for (int i=1; i<=keys.length(); i++) {
                if (map.containsKey(keys.charAt(i-1))) {
                    map.put(keys.charAt(i-1), Math.min(map.get(keys.charAt(i-1)), i));
                } else {
                    map.put(keys.charAt(i - 1), i);
                }
            }
        }

        int i = 0;
        for (String tar : targets) {
            boolean isValid = true;
            int cnt = 0;
            for (char c : tar.toCharArray()) {
                if (!map.containsKey(c)) {
                    answer[i] = -1;
                    isValid = false;
                    break;
                }
                cnt += map.get(c);
            }

            if (isValid)
                answer[i] = cnt;
            i++;
        }


        return answer;
    }

    // 테스트케이스 절반이 불통이라 뭐가 문제지? 어쩔어쩔어쩔어쩔어쩌라고 상태였음
    // map 초기화가 잘못됐나 싶어서 디버깅 해봤지만 문제는 없었음
    // 근데 다시 쓱~ 보니까 isValid 초기화 위치가 잘못됨.
    // 루프 바깥 쪽에서 초기화하고 있어서 false였던 값이 바뀌질 않으니
    // answer에 cnt 값을 못 넣고 있던 거였음
    // 해결해결~~
}
