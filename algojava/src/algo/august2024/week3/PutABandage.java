package algo.august2024.week3;

import java.util.HashMap;
import java.util.HashSet;

// 240813 - 붕대 감기
public class PutABandage {
    public int solution(int[] bandage, int health, int[][] attacks) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int[] attack : attacks) {
            set.add(attack[0]);
            map.put(attack[0], attack[1]);
        }

        int trial = bandage[0];
        int heal = bandage[1];
        int bonus = bandage[2];
        int lastAttack = attacks[attacks.length-1][0];

        int max = health;
        for (int i=1; i<=lastAttack; i++) {

            if (set.contains(i)) {
                trial = bandage[0];
                health -= map.get(i);

                if (health <= 0)
                    return -1;

            } else {
                trial -= 1;
                health += heal;

                if (trial == 0) {
                    health += bonus;
                    trial = bandage[0];
                }

                if (health > max)
                    health = max;


            }

        }

        return health;
    }
}
