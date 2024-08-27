package algo.august2024.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 240827 - 모의고사
public class MockExam {
    public int[] solution(int[] answers) {

        int[] hater1 = {1,2,3,4,5};
        int[] hater2 = {2,1,2,3,2,4,2,5};
        int[] hater3 = {3,3,1,1,2,2,4,4,5,5};

        int len1 = hater1.length;
        int len2 = hater2.length;
        int len3 = hater3.length;

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == hater1[i%len1])
                cnt1++;

            if (answers[i] == hater2[i%len2])
                cnt2++;

            if (answers[i] == hater3[i%len3])
                cnt3++;
        }

        int[] haters = {cnt1, cnt2, cnt3};
        int max = Math.max(cnt1, cnt2);
        max = Math.max(max, cnt3);

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<haters.length; i++) {
            if (haters[i] == max) {
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }


    // 예전에 풀었던 코드
    /*int[][] pattern = {
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
    *
    * */
}
