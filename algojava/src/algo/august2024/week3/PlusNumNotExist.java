package algo.august2024.week3;


// 240816 - 없는 숫자 더하기
public class PlusNumNotExist {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i=0; i<10; i++) {
            answer += i;
        }
        for (int num : numbers) {
            answer -= num;
        }

        return answer;

        // return IntStream.range(1,10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
        // return 45 - Arrays.stream(numbers).sum();
    }
}
