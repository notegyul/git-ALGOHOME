package algo.september2024.week1;

import java.util.Arrays;

// 240905 - 구명보트
public class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int s = 0;
        int e = people.length - 1;

        while (s <= e) {
            if (s == e) {
                answer++;
                break;
            }

            if (people[s] + people[e] <= limit) {
                answer++;
                s++;
                e--;
            } else {
                answer++;
                e--;
            }
        }

        return answer;
    }

    // Top-Bottom
}
