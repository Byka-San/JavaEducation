package Lr_03;

import java.util.Scanner;
import java.util.Random;
public class example10_09 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int Size = id.nextInt();
        System.out.println("Размер массива равен: " + Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int a = 0; a < nums.length; a++) {
            nums[a] = random.nextInt(200);
            System.out.println("Элемент массива [" + a + "] = " + nums[a]);
        }
        System.out.println("Конец массива nums[a]\n");
        int[] min_count = new int[Size];
        int[] min_nums = new int[Size];
        int min = nums[0];
        for (int b = 0; b < 2; b++) {
            for (int c = 0; c < nums.length; c++) {
                if (min >= nums[c]) {
                    min_count[c] = c;
                    min = nums[c];
                    min_nums[c] = nums[c];
                } else {
                    min_count[c] = 0;
                    min_nums[c] = 0;
                }
            }
        }
        for (int d = 0; d < nums.length; d++) {
            if (min_nums[d] == min && min_count[d] != 0) {
                System.out.println("Элемент массива [" + min_count[d] + "]" + min_nums[d] + "- минимальное значение\n");
            }
        }
    }
}