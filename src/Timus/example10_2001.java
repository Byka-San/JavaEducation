package Timus;

import java.util.Scanner;

public class example10_2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        String[] A = a.split(" ");
        String[] B = b.split(" ");
        String[] C = c.split(" ");

        System.out.print(Integer.parseInt(A[0].trim())-Integer.parseInt(C[0].trim()));
        System.out.print(" ");
        System.out.print(Integer.parseInt(A[1].trim())-Integer.parseInt(B[1].trim()));
    }
}
