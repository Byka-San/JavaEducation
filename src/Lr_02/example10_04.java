package Lr_02;

import java.util.Scanner;
public class example10_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число:");
        int a = in.nextInt();
        if (a >= 5 && a <= 10) {
            System.out.println("Число находится в диапазоне от 5 до 10");
        } else {
            System.out.println("Число не входит в диапазон от 5 до 10");
        }
    }
}
