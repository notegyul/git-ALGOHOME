package algo.august2024.week5;

import java.util.Arrays;
import java.util.HashSet;

// 240831 - 체육복
public class PEUniform {
    public int solution(int n, int[] lost, int[] reserve) {

        HashSet<Integer> lostSet = new HashSet<>();
        for (int l : lost) {
            lostSet.add(l);
        }

        HashSet<Integer> reserveSet = new HashSet<>();
        for (int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r);
            } else {
                reserveSet.add(r);
            }
        }

        for (int r : reserveSet) {
            if (lostSet.contains(r-1)) {
                lostSet.remove(r-1);
            } else if (lostSet.contains(r+1)) {
                lostSet.remove(r+1);
            }
        }


        return n - lostSet.size();
    }
}
