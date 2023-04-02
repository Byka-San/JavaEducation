package Lr_11;

import java.util.Scanner;

public class example_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        inputArray(array, 0);

        System.out.println("Массив:");
        outputArray(array, 0);
    }

    public static void inputArray(int[] array, int index) {
        Scanner scanner = new Scanner(System.in);

        if (index == array.length) {
            return;
        }

        System.out.print("Введите элемент массива [" + index + "]: ");
        array[index] = scanner.nextInt();

        inputArray(array, index + 1);
    }

    public static void outputArray(int[] array, int index) {
        if (index == array.length) {
            return;
        }

        System.out.println("Элемент массива [" + index + "]: " + array[index]);

        outputArray(array, index + 1);
    }
}
