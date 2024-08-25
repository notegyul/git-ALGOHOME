package algo.august2024.week5;

import java.util.Arrays;
import java.util.PriorityQueue;

// 240824 - 명예의 전당
public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];

        // 명예의 전당 배열 -> 첫 날부터 k일까지 모든 참가자가 전당에 오른다
        int[] fame = new int[k];
        for (int i=0; i<k; i++) {
            fame[i] = score[i];
        }

        // 첫 번째 전당 꼴찌는 score의 첫 번째 요소 always
        result[0] = fame[0];

        int bottom = fame[0];
        for (int i=1; i<k; i++) {
            bottom = Math.min(bottom, fame[i]);
            result[i] = bottom;
        }

        Arrays.sort(fame);

        for (int i=k; i<score.length; i++) {
            if (score[i] > fame[0]) {
                fame[0] = score[i];
                Arrays.sort(fame);
            }

            result[i] = fame[0];
        }

        return result;
    }

    // 테케 2개 런타임 에러 뭐임 ?


    public int[] otherSolution(int k, int[] score) {
        int[] result = new int[score.length];

        PriorityQueue<Integer> fame = new PriorityQueue<>();

        for (int i=0; i<score.length; i++) {
            fame.add(score[i]);
            if (fame.size() > k) {
                fame.poll();
            }

            result[i] = fame.peek();
        }

        return result;
    }


    /**  런타임 에러 발생 코드: 큐 크기와 이른 접근으로 인한 문제일 가능성 높음
     *
     * PriorityQueue<Integer> fame = new PriorityQueue<>(k);
     *         for (int i=0; i<k; i++) {
     *             fame.add(score[i]);
     *             result[i] = fame.peek();
     *         }
     *
     *         for (int i=k; i<score.length; i++) {
     *             if (score[i] > fame.peek()) {
     *                 fame.poll();
     *                 fame.add(score[i]);
     *             }
     *
     *             result[i] = fame.peek();
     *         }
     *
     *         return result;
     *
     */

}
