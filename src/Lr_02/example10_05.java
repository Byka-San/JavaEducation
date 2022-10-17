package Lr_02;

import java.util.Scanner;
public class example10_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число:");
        int a = in.nextInt();
        int b = a/1000;
        System.out.println("Количество тысяч в введенном числе равно: " + b);
    }
}
