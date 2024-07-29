package algo.july2024.week5;

import java.util.HashSet;

// 두 개의 수로 특정값 만들기 (240729) : HashSet<Integer> 활용
public class MakeNumberUsingNums {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9};
        int target = 10;

        System.out.println(solution(arr, target));

    }


    static public boolean solution(int[] arr, int target) {

        HashSet<Integer> hash = new HashSet<>();

        // 만약 arr 전체를 hashSet으로 만든 후에 아래를 실행할 경우 중복된 값, 또는 우연의 일치로 값이 의도와 다르게 출력될 수 있음
        // target = 10, num = 5인 경우. 이미 모든 arr 요소에 대한 해시셋을 만들어뒀기 때문에
        // hashSet.contains(target-num)을 할 경우 true가 반환됨
        // arr의 모든 요소는 중복되지 않는다고 했으므로 5와 페어가 되어 타겟 넘버 10을 만들 숫자는 존재하지 않는데, 존재하게 되는 것임


        for (int num : arr) {
            if (hash.contains(target - num)) {
                return true;
            }

            hash.add(num);
        }

        return false;
    }

}
