package Lr_13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example_05 {
    public static int result = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество элементов массива: ");
        int sc = scanner.nextInt();
        int[] arr = new int[sc];

        Random random = new Random();
        for (int a = 0; a < sc; a++) {
            arr[a] = random.nextInt(1000000);
        }

        System.out.println(Arrays.toString(arr));

        FM(arr, sc);

    }

    public static void FM(int[] arr, int sc) throws InterruptedException{
        int courentSC1 = sc / 3;
        Thread core1 = new Thread(() -> {
            for (int a = 0; a < courentSC1; a++) {
                if (result < arr[a]) {
                    result = arr[a];
                }
            }
        });

        Thread core2 = new Thread(() -> {
            for (int a = courentSC1; a > 0; a--) {
                if (result < arr[a]) {
                    result = arr[a];
                }
            }
        });

        Thread core3 = new Thread(() -> {
            for (int a = courentSC1; a < courentSC1 * 2; a++) {
                if (result < arr[a]) {
                    result = arr[a];
                }
            }
        });

        Thread core4 = new Thread(() -> {
            for (int a = courentSC1 * 2; a > courentSC1; a--) {
                if (result < arr[a]) {
                    result = arr[a];
                }
            }
        });

        Thread core5 = new Thread(() -> {
            for (int a = courentSC1 * 2; a < sc; a++) {
                if (result < arr[a]) {
                    result = arr[a];
                }
            }
        });

        Thread core6 = new Thread(() -> {
            for (int a = sc-1; a > courentSC1 * 2; a--) {
                if (result < arr[a]) {
                    result = arr[a];
                }
            }
        });

        core1.start();
        core2.start();
        core3.start();
        core4.start();
        core5.start();
        core6.start();

        core6.join();

        System.out.println(result);
        int b = 0;
        for (int bo =0 ; bo<arr.length-1; bo++){
            if (arr[bo]>b){
                b = arr[bo];
            }
        }

        System.out.println("Контрольный максимум равен: " + b);

    }
}