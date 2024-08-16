package algo.august2024.week3;

// 240816 - 서울에서 김서방 찾기
public class FindKimInSeoul {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim"))
                return "김서방은 " + i + "에 있다";
        }

        return answer;

        /*
        * int x = Arrays.asList(seoul).indexOf("Kim");
        * return "김서방은 " + x +"에 있다";
        * indexOf()안에서 for문을 도는데.. 굳이 해당 배열을 갖는 ArrayList 메모리 할당해서 indexOf쓸 필요 없이 배열 자체 for문 돌리는게 더 낫습니다!
        *
        * 리턴 값을 StringBuilder를 사용해서 하면 훨씬 빠른 속도로 결과를 도출할 수 있습니다! TMI... return new StringBuilder("김서방은 ").append(x).append("에 있다");
        *
        * */
    }
}
