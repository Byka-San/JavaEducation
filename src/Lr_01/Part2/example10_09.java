package Lr_01.Part2;

import java.util.Scanner;
public class example10_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число:");
        int a = in.nextInt();
        int d = a;
        int b = --a;
        int c = 2 + a;
        int sum = d + b + c;
        double pow = sum*sum;
        System.out.printf("Итог: \nЧисло: %s \nЧисло - 1: %s \nЧисло + 1: %s \nКвадрат суммы чисел: %s \n ", d, b, c, pow);
    }
}
