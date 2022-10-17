package Lr_02;

import java.util.Scanner;
public class example10_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число:");
        int a = in.nextInt();
        if (a%4 == 0) {
            System.out.println("Делится нв 4 без остатка");
        }
        else {
            System.out.println("Не делится на 4 без остатка");
        }
        if (a > 10) {
            System.out.println("Число больше 10");
        }
        else {
            System.out.println("Число меньше или равно 10");
        }
    }
}
