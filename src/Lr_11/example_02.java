package Lr_11;

import java.util.Scanner;

public class example_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для перевода в двоичную систему: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println(decimalNumber + " в двоичной системе = " + binaryNumber);
    }

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        } else if (decimalNumber == 1) {
            return "1";
        } else {
            return decimalToBinary(decimalNumber / 2) + decimalNumber % 2;
        }
    }
}