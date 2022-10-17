package Lr_02;

import java.util.Scanner;
public class example10_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = in.nextInt();
        if (a % 3 == 0) {
            System.out.println("Данное число делится на 3 без остатка");
        } else {
            System.out.println("Данное число не делится на 3 без остатка");
        }
    }
}
