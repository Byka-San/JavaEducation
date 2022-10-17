package Lr_02;

import java.util.Scanner;
public class example10_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число:");
        int a = in.nextInt();
        if (a%5 == 2) {
            System.out.println("Делится нв 5 с остатком 2");
        }
        else {
            System.out.println("Не делится на 5 с остатком 2");
        }
        if (a%7 == 1) {
            System.out.println("Делится на 7 с остатком 1");
        }
        else {
            System.out.println("Не делится на 7 с остатком 1");
        }
    }
}
