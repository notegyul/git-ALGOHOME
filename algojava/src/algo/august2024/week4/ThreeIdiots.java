package algo.august2024.week4;

// 240821 - 삼총사
public class ThreeIdiots {
    public int solution(int[] number) {

        int size = number.length;
        int result = 0;
        for (int i=0; i<size-2; i++) {
            for (int j=i+1; j<size-1; j++) {
                int sum = number[i] + number[j] + number[j+1];
                if (sum == 0)
                    result++;
            }
        }

        return result;
    }


}
