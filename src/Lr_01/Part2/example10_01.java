package Lr_01.Part2;

import java.util.Scanner;
public class example10_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("surname:");
        String surname = in.nextLine();
        System.out.print("name:");
        String name = in.nextLine();
        System.out.print("patronymic:");
        String patronymic= in.nextLine();
        System.out.printf("Hello," + " " + name + " " + surname + " " + patronymic);
        in.close();
    }
}
