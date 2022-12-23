package Timus;

import java.util.Scanner;
public class example10_1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 2) System.out.println ((n - 2) * 2 + 2);
        else System.out.println(2);
    }
}
