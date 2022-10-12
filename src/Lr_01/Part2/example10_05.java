package Lr_01.Part2;

import java.util.Scanner;
public class example10_05 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Год рождения:");
        int age = in.nextInt();
        System.out.printf("Ваш возраст: %s", 2022 - age);
    }
}
