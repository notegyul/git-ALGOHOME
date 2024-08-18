package algo.august2024.week4;

// 240818 - 부족한 금액 계산하기
public class CalculateInsufficientAmount {
    public long solution(int price, int money, int count) {


        long tmp = 0;
        for (int i=1; i<=count; i++) {
            tmp += price * i;
        }

        if (money-tmp >= 0)
            return 0;

        return (long) -(money-tmp);

        /*
        * long answer = money;
        * 반복문 안에서 money -= price * 1;
        * */
    }
}
