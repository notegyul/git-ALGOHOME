package algo.august2024.week4;

import java.util.Scanner;

// 240818 - 직사각형 별찍기
public class RectangleWithStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int k = 0; k<b; k++) {
            for (int m=0; m<a; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
