package algo.august2024.week1;

import java.util.ArrayList;
import java.util.HashMap;

// 240803 오픈 채팅방 - 해시
public class OpenChat {

    public String[] solution(String[] record) {

        HashMap<String, String> userMap = new HashMap<>();
        for (String re : record) {
            String[] tmp = re.split(" ");
            // Leave인 경우 닉네임은 없으므로 split 배열의 크기로 키워드를 분기할 수 있음
            if (tmp.length == 3) {
                userMap.put(tmp[1], tmp[2]);
            }
        }

        ArrayList<String> arr = new ArrayList<>();
        for (String re : record) {
            if (re.split(" ")[0].equals("Enter")) {
                arr.add(userMap.get(re.split(" ")[1]) + "님이 들어왔습니다.");
            } else if (re.split(" ")[0].equals("Leave")) {
                arr.add(userMap.get(re.split(" ")[1]) + "님이 나갔습니다.");
            }
        }

        return arr.toArray(new String[0]);
    }

    /*
    * (1) HashMap의 put() 메서드는 이미 존재하는 키의 경우 그 값을 덮어씌움. 따라서 단순히 키의 값을 갱신해야 하는 경우라면
    *       번거롭게 containsKey로 체크할 필요가 없음. 만일 특정 조건에서만 값을 업데이트하고 싶다면 replace()를 사용할 것.
    *       그 외엔 put()으로도 충분하다.
    * (2) 마지막 return문에서 매개변수도 new String[0]가 들어간 이유
    *       ArrayList의 toArray() 메서드는 전달된 배열의 크기가(즉 매개변수로 들어온) arrayList보다 작다면 동적으로 배열의 크기를 
    *       늘릴 수 있다. 즉 동적으로 배열 생성이 가능하다.
    *       ex) arrayList.toArray(new String[0]); -> arrayList의 size()가 3이라면 이 경우 최종적으로 크기가 3인 배열로 변환됨
    * */
}
