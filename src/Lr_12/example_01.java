package Lr_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер необходимого массива");
        int a = in.nextInt();
        int[] arr = new int[a];
        Random random = new Random();
        for (int i = 0; i<a; i++){
            arr[i] = random.nextInt();
        }

        System.out.println("Масив до преобразования: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = B(arr);

        System.out.println("Массив после преобразования: ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] B(int[] arr){
        return Arrays.stream(arr).filter(x -> x%2 == 0).toArray();
    }
}
