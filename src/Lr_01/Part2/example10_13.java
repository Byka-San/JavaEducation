package Lr_01.Part2;

import java.util.Scanner;
public class example10_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Главное число a:");
        int a = in.nextInt();
        System.out.print("Степень числа b:");
        int b = in.nextInt();
        double pow  = Math.pow(a,b);
        System.out.printf("Итог: %s", pow);
    }
}
