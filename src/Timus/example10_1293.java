package Timus;

import java.io.PrintWriter;
import java.util.Scanner;
public class example10_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        if (N >= 1 && N <= 100 && B >= 1 && B <= 100 && A >= 1 && A <= 100) {
            out.println(A * B * N * 2);
        }
        out.flush();
    }
}
