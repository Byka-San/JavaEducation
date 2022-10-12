package Lr_01.Part2;

import java.util.Scanner;
public class example10_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Имя:");
        String name = in.nextLine();
        System.out.print("Год рождения:");
        int age = in.nextInt();
        System.out.printf("Имя: %s \nВозраст: %s", name, 2022 - age);
    }
}
