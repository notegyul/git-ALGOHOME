package algo.august2024.week5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 240829 - 다트게임
public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;

        String[] records = new String[3];
        Pattern pattern = Pattern.compile("(\\d+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);

        int idx = 0;
        while(matcher.find()) {
            records[idx] = matcher.group();
            idx++;
        }

        int[] scores = new int[3];
        int scoreIdx = 0;
        for (String record : records) {
            Matcher mc = pattern.matcher(record);

            if (mc.find()) {
                int curScore = Integer.parseInt(mc.group(1));
                String space = mc.group(2);
                String option = mc.group(3);

                switch (space) {
                    case "S":
                        break;
                    case "D":
                        curScore = curScore * curScore;
                        break;
                    case "T":
                        curScore = curScore * curScore * curScore;
                        break;
                }

                if (option.equals("*")) {
                    if (scoreIdx > 0) {
                        scores[scoreIdx - 1] = scores[scoreIdx-1] * 2;
                        curScore *= 2;
                    } else {
                        curScore *= 2;
                    }
                } else if (option.equals("#")) {
                    curScore *= -1;
                }
                scores[scoreIdx] = curScore;
                scoreIdx++;
            }

        }

        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}
