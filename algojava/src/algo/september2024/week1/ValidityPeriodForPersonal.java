package algo.september2024.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.*;

// 개인정보 수집 유효기간
public class ValidityPeriodForPersonal {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();

        // 약관별 기간 map
        HashMap<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            if (term.split(" ").length >= 2) {
                map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
            }
        }

        // today를 정수로 바꿈
        int oneul = Integer.parseInt(today.replace(".", ""));

        String pattern = "(\\d{4})\\.(\\d{2})\\.(\\d{2})\\s([A-Z])";
        Pattern p = Pattern.compile(pattern);

        int i = 0;
        for (String privacy : privacies) {
            Matcher m = p.matcher(privacy);
            if (m.find()) {
                int year = Integer.parseInt(m.group(1));
                int month = Integer.parseInt(m.group(2));
                int day = Integer.parseInt(m.group(3));
                String type = m.group(4);

                month += map.get(type);
                while (month > 12) {
                    month -= 12;
                    year++;
                }

                if (day == 1) {
                    month--;
                    if (month == 0) {
                        month = 12;
                        year--;
                    }
                    day = 28;
                } else {
                    day--;
                }


                int result = Integer.parseInt(String.format("%04d%02d%02d", year, month, day));
                if (result < oneul) {
                    list.add(i + 1);
                }
            }
            i++;
        }


        int[] answer = new int[list.size()];
        if (list.size() > 0) {
            for (int k = 0; k < list.size(); k++) {
                answer[k] = list.get(k);
            }
        }

        return answer;
    }

    // 이렇게 풀고 통과하면 너무 기분 좋은데,
    // 다른 사람 풀이 보면 자괴감 든다규~
}
