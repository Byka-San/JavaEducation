package Lr_09.Example_2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class example10_03 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        try {
            int line  = scan.nextInt();
            byte[] arr = new byte[line ];
            for (int a = 0; a < arr.length; a++) {
                System.out.println("Введите значения типа byte для заполнения массива " +count+": ");
                arr[a] = scan.nextByte();
            }
            for (byte b : arr) {
                System.out.print(b +", ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некоректное значение!" + "(" + e + ")");
        }
    }
}
