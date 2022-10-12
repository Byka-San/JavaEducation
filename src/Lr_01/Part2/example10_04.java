package Lr_01.Part2;

import java.util.Scanner;
public class example10_04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String Month = in.nextLine();
        System.out.print("Number of days: ");
        int i = in.nextInt();
        if(i <= 31){
            System.out.print("True ");}
        else {
            System.out.print("False ");
        }

        System.out.printf("%s %d \n", Month, i);

        in.close();
    }
}
