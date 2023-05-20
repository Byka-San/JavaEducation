package Timus_2;

import java.util.Arrays;
import java.util.Scanner;
public class example_1021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[s.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int c[] = new int[s.nextInt()];
        for (int i = 0; i < c.length; i++) {
            c[i] = s.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(c);;
        for (int i = 0; i < a.length; i++) {
            if (Arrays.binarySearch(c, 10000 - a[i]) >= 0) {
                System.out.println("Да");
                System.exit(0);
            }
        }
        System.out.println("Нет");
    }
}
