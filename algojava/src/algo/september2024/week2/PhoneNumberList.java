package algo.september2024.week2;

import java.util.Arrays;
import java.util.HashSet;

// 240909 - 전화번호 목록
public class PhoneNumberList {
    public boolean solution(String[] phone_book) {

        // 길이에 따른 오름차순 정렬
        // Arrays.sort(phone_book, (p1, p2) -> p1.length() - p2.length());

        HashSet<String> set = new HashSet<>();
        for (String num : phone_book) {
            set.add(num);
        }

        for (int i=0; i< phone_book.length; i++) {
            String number = phone_book[i];

            for (int j=1; j<number.length(); j++) {
                if (set.contains(number.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
    // 처음부터 set에 다 안 넣고 하나씩 돌면서 통과한 애들을 set에 추가해 주니까
    // 효율성 2개에서 시간 초과 났음
}

