package algo.july2024.week5;

import java.util.HashMap;

//240729
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // hashMap 데이터 추가
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 4);

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.get("A"));
        System.out.println(hashMap.containsKey("A"));

        hashMap.remove("A");
        System.out.println(hashMap.size());

        // 해시맵의 모든 데이터 삭제
        hashMap.clear();
        System.out.println(hashMap.isEmpty());

    }
}
