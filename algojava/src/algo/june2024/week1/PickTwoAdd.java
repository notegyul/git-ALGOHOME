package algo.june2024.week1;

import java.util.*;

public class PickTwoAdd {
    public static void main(String[] args) {

    }

    public int[] solution(int[] numbers) {
        // TreeSet을 쓰면 add와 동시에 정렬이 된다고 함!
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int i = 0;
        for (int n : set) {
            answer[i++] = n;
        }

        Arrays.sort(answer);

        return answer;
    }
}
