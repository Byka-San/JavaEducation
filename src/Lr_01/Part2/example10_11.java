package Lr_01.Part2;

import java.util.Scanner;
public class example10_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = in.nextInt();
        System.out.print("Второе число: ");
        int b = in.nextInt();
        long area = Math.round(Math.E * (b*Math.log(a)));
        System.out.printf("Итог: %s", area);
    }
}
