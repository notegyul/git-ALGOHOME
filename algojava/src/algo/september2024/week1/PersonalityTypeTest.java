package algo.september2024.week1;

import java.util.HashMap;
import java.util.Map;

// 240901 - 성격 유형 검사하기
public class PersonalityTypeTest {
    public String solution(String[] survey, int[] choices) {
        String result = "";

        int[] standard = {0, 3, 2, 1, 0, 1, 2, 3};

        String s = "RTCFJMAN";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<8; i++) {
            map.put(s.charAt(i), 0);
        }

        for (int i=0; i<survey.length; i++) {
            if (choices[i] == 4)
                continue;

            // 비동의: 앞
            if (choices[i] < 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + standard[choices[i]]);
            } else {        // 동의: 뒤
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + standard[choices[i]]);
            }
        }

        for (int i=0; i<8; i+=2) {
            if (map.get(s.charAt(i)) == map.get(s.charAt(i+1))){
                result += s.charAt(i);
            } else if (map.get(s.charAt(i)) > map.get(s.charAt(i+1))) {
                result += s.charAt(i);
            } else {
                result += s.charAt(i+1);
            }
        }

        return result;
    }


    // 예전에 푼 코드
    public String presSolution(String[] survey, int[] choices) {
        Map<String, Integer> scores = new HashMap<>();
        String[] types = {"R", "T", "C", "F", "J", "M", "A", "N"};
        for (String type : types) {
            scores.put(type, 0);
        }

        // Calculate scores based on survey and choices
        for (int i = 0; i < choices.length; i++) {
            String surveyItem = survey[i];
            int choice = choices[i];
            if (choice == 4) continue; // "모르겠음" 선택지는 점수를 얻지 않습니다.

            char typeDisagree = surveyItem.charAt(0);
            char typeAgree = surveyItem.charAt(1);

            if (choice < 4) { // 비동의 선택지
                scores.put(String.valueOf(typeDisagree), scores.get(String.valueOf(typeDisagree)) + (4 - choice));
            } else if (choice > 4) { // 동의 선택지
                scores.put(String.valueOf(typeAgree), scores.get(String.valueOf(typeAgree)) + (choice - 4));
            }
        }

        // Determine the personality type
        StringBuilder result = new StringBuilder();
        Map<String, String> typePairs = new HashMap<>();
        typePairs.put("R", "T");
        typePairs.put("C", "F");
        typePairs.put("J", "M");
        typePairs.put("A", "N");

        for (Map.Entry<String, String> entry : typePairs.entrySet()) {
            String type1 = entry.getKey();
            String type2 = entry.getValue();
            if (scores.get(type1) >= scores.get(type2)) {
                result.append(type1);
            } else {
                result.append(type2);
            }
        }

        return result.toString();
    }
}
