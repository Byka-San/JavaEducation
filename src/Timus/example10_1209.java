package Timus;

import java.util.Scanner;
import java.util.StringJoiner;
public class example10_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        StringJoiner result = new StringJoiner(" ");
        while (num > 0) {
            long x = sc.nextLong();
            double a = Math.sqrt(8*x-7);
            if (a % 1 == 0)
                result.add("1");
            else
                result.add("0");
            num--;
        }
        sc.close();
        System.out.println(result);
    }
}
