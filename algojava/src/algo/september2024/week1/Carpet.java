package algo.september2024.week1;

// 240904 - 카펫
public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int w=3; w<=3000; w++) {
            for (int h=3; h<=3000; h++) {
                if (brown == ((w*2) + (h-2)*2) && w*h == brown+yellow) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }

        return answer;
    }
}
