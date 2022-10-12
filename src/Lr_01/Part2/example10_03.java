package Lr_01.Part2;

import java.util.Scanner;
public class example10_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Day of the week:");
        String dotw = in.nextLine();
        System.out.print("Month:");
        String month = in.nextLine();
        System.out.print("Data:");
        int data = in.nextInt();

        System.out.printf("Day of the week -%s , Data - %s , Month - %s", dotw,data,month);
        in.close();

    }
}
