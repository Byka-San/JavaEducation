package Lr_02;

import java.util.Scanner;
public class example10_08_timus_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число решенных задач за час:");
        int a = in.nextInt();
        if (a>6) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}