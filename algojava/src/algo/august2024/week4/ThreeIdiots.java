package algo.august2024.week4;

// 240821 - 삼총사
public class ThreeIdiots {
    public int solution(int[] number) {

        int size = number.length;
        int result = 0;
        for (int i=0; i<size-2; i++) {
            for (int j=i+1; j<size-1; j++) {
                for (int k=j+1; k<size; k++) {
                    int sum = 0;
                    sum += (number[i] + number[j] + number[k]);
                    if (sum == 0)
                        result++;
                }
            }
        }

        return result;
    }

    // 1점짜리 문제라고? 진짜 소름돋는다;;


}
