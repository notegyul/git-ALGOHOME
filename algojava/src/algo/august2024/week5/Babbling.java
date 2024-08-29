package algo.august2024.week5;

// 240829 - 옹알이
public class Babbling {
    public int solution(String[] babbling) {
        int cnt = 0;

        for (String ba : babbling) {
            if (ba.contains("ayaaya") || ba.contains("yeye") || ba.contains("woowoo")|| ba.contains("mama"))
                continue;

            ba = ba.replace("aya", "z");
            ba = ba.replace("ye", "z");
            ba = ba.replace("woo", "z");
            ba = ba.replace("ma", "z");
            ba = ba.replace("z", "");

            if (ba.length()==0)
                cnt++;
        }
        return cnt;
    }
}
