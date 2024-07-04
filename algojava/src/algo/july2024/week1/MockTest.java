package algo.july2024.week1;

import java.util.ArrayList;
import java.util.Arrays;

// 240704 - 모의고사(나머지연산자 사용법 숙지)
public class MockTest {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] answers) {
            int[][] pattern = {
                    {1, 2, 3, 4, 5},
                    {2, 1, 2, 3, 2, 4, 2, 5},
                    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
            };

            int[] scores = new int[3];

            for (int i=0; i<answers.length; i++) {
                for (int j=0; j< pattern.length; j++) {
                    if (answers[i] == pattern[j][i % pattern[j].length]) {
                        scores[j]++;
                    }
                }
            }

            int maxScore = Arrays
                    .stream(scores)
                    .max()
                    .getAsInt();

            ArrayList<Integer> answer = new ArrayList<>();
            for (int k=0; k<scores.length; k++) {
                if (scores[k] == maxScore) {
                    answer.add(k+1);
                }
            }

            return answer
                    .stream()
                    .mapToInt(Integer :: intValue)
                    .toArray();
        }
    }
}
