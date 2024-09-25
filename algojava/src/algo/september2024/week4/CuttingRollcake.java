package algo.september2024.week4;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;

// 240925 - 롤케이크 자르기
public class CuttingRollcake {
    public int solution(int[] topping) {
        int answer = 0;

        int toppingSize = topping.length;



        for (int t=1; t<topping.length-1; t++) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int i=0; i<t; i++) {
                set1.add(topping[i]);
            }

            if (set1.size() > toppingSize-t) {
                continue;
            }

            for (int j=t; j<topping.length; j++) {
                set2.add(topping[j]);
                if (set1.size() < set2.size())
                    continue;
            }

            if (set1.size() == set2.size())
                answer++;
        }

        return answer;
    }

    // map을 두 개 만들고 한번의 순회로 양쪽의 토핑 종류 개수를 비교하는 식으로 개선
}
