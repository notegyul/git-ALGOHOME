package algo.august2024.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

// 240819 - 같은 숫자는 싫어
public class HateSameNumber {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()) {
            if (list.isEmpty()){
                list.add(stack.pop());
                continue;
            }

            int curIdx = list.size()-1;
            int curNum = stack.pop();
            if (list.get(curIdx) == curNum)
                continue;
            list.add(curNum);
        }

        // 정렬 없이 단순 리버스
        Collections.reverse(list);

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
