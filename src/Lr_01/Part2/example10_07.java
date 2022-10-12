package Lr_01.Part2;

import java.util.Scanner;
public class example10_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Возраст:");
        int age = in.nextInt();
        System.out.printf("Год рождения: %s", 2022 - age);
    }
}
