package Lr_01.Part2;

import java.util.Scanner;
public class example10_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число:");
        int a = in.nextInt();
        System.out.print("Второе число:");
        int b = in.nextInt();
        int c = a + b;
        int e = a - b;
        System.out.printf("Сумма чисел: %s\nРазность чисел: %s\n", c, e);
    }
}
