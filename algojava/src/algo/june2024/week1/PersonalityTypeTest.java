package algo.june2024.week1;

import java.util.HashMap;
import java.util.Map;

// 240608 - 성격 유형 검사하기
public class PersonalityTypeTest {

    public static void main(String[] args) {


    }

    public class Solution {
        public String solution(String[] survey, int[] choices) {

            Map<String, Integer> typeMap = new HashMap<>();
            String[] types = {"R", "T", "C", "F", "J", "M", "A", "N"};
            for (int i=0; i<types.length; i++) {
                typeMap.put(types[i], (i/2)+1);
            }

            




            String answer = "";
            return answer;
        }
    }
}
