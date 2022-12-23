package Timus;

import java.util.Scanner;
public class example10_1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] A = a.split(" ");
        System.out.print(Integer.parseInt(A[0].trim())*(Integer.parseInt(A[1].trim())+1));
    }
}
