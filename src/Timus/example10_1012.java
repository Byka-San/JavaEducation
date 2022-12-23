package Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class example10_1012 {
    public static void main(String str[]) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(consoleReader.readLine());
        int b = Integer.parseInt(consoleReader.readLine());
        BigInteger d = BigInteger.valueOf(b - 1);
        BigInteger e = BigInteger.valueOf(b * (b - 1));
        BigInteger c = BigInteger.valueOf(b - 1);
        for (int i = 2; i < a; i++) {
            BigInteger next = (d.add(e)).multiply(c);
            d = e;
            e = next;
        }
        System.out.println(e);
    }
}
