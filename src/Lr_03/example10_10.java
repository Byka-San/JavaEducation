package Lr_03;

import java.util.Random;
import java.util.Scanner;
public class example10_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Размер массива равен: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        int tmp;
        for (tmp = 0; tmp < arr.length; ++tmp) {
            arr[tmp] = random.nextInt(400);
        }
        System.out.println("Исходный массив: ");
        int[] v = arr;
        int c = arr.length;
        int a;
        int b;
        for (a = 0; a < c; ++a) {
            b = v[a];
            System.out.print("" + b + " ");
        }
        for (c = 0; c < arr.length - 1; ++c) {
            for (a = c + 1; a < arr.length; ++a) {
                if (arr[c] < arr[a]) {
                    tmp = arr[c];
                    arr[c] = arr[a];
                    arr[a] = tmp;
                }
            }
        }
        System.out.println("\nОтсортированный: ");
        for (int values : arr) {
            System.out.print(values + " ");
        }
    }
}
