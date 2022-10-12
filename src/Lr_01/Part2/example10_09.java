package Lr_01.Part2;

import java.util.Scanner;
public class example10_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число:");
        int a = in.nextInt();
        int b = --a;
        int c = ++a;
        int sum = a + b + c;
        double pow = Math.pow(a,c);
        System.out.printf("Итог: \nЧисло: %s \nЧисло - 1: %s \nЧисло + 1: %s \nКвадрат суммы чисел: %s \n ", a, b, c, pow);
    }
}
