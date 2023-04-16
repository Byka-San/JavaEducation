package Lr_12;

import java.util.Arrays;
import java.util.Random;

public class example_08 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        Random random = new Random();
        for (int a = 0; a < size; a++){
            arr[a] = random.nextInt(500);
        }

        System.out.println("\n Список до преобразования: ");
        System.out.println(Arrays.toString(arr));
        int num = 250;
        int[] arrResult = filterEvenNumbers(arr, num);
        System.out.println("\n Список после преобразования: ");
        System.out.println(Arrays.toString(arrResult));

    }

    private static int[] filterEvenNumbers(int[] arr, int c) {
        return Arrays.stream(arr).filter(b -> b > c).toArray();
    }
}
