package Timus;

import java.util.Scanner;

public class example10_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число растреленных банок Гарри:");
        int a = in.nextInt();
        System.out.print("Число растреленных банок Ларри:");
        int b = in.nextInt();
        int c = 10 - a;
        int d = 10 - b;
        System.out.println(c + " " + d);
    }
}

