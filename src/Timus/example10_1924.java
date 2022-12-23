package Timus;

import java.util.Scanner;
public class example10_1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean flag = false;
        for (int i = 2;i < n; i+=2) {
            flag = !flag;
        }

        if (flag) System.out.println("black");
        else System.out.println("grimy");
    }
}
