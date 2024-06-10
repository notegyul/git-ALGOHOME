package algo.june2024.week1;

import java.util.HashMap;
import java.util.Map;

// 240608 - 성격 유형 검사하기
public class PersonalityTypeTest {

    public static void main(String[] args) {


    }

    public class Solution {
        public String solution(String[] survey, int[] choices) {

            String[] types = {"R", "T", "C", "F", "J", "M", "A", "N"};

            HashMap<String, Integer> innerMap = new HashMap<>();
            for (int k=0; k<choices.length; k++) {
                if (choices[k] == 4) {
                    continue;
                }

                String character = "";
                char[] tmpChar = survey[k].toCharArray();
                // 앞 캐릭터 (1~3) / 뒤 캐릭터 (5~7)
                if (choices[k] < 4) {
                    character = String.valueOf(tmpChar[0]);
                    int point = 4 - choices[k];
                    innerMap.put(character, innerMap.getOrDefault(character, 0) + point);

                } else {
                    character = String.valueOf(tmpChar[1]);
                    int point = choices[k] - 4;
                    innerMap.put(character, innerMap.getOrDefault(character, 0) + point);
                }
            }


            HashMap<Integer, HashMap<String, Integer>> hm = new HashMap<>();
            for (int i=0; i<4; i++) {
                HashMap<String, Integer> newInnerMap = new HashMap<>(innerMap);
                hm.put(i+1, newInnerMap);
            }


            StringBuffer answer = new StringBuffer();
            for (Integer typeNum : hm.keySet()) {

                for (String typeStr : hm.get(typeNum).keySet()) {

                }
            }

            return answer.toString();
        }
    }
}
