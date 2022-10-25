package Lr_03;

import java.util.Scanner;
public class example10_06 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        if (id.hasNextInt()) {
            int Size = id.nextInt();
            if (Size > 0) {
                System.out.println("Размер массива равен:"+ Size);
                int[] nums = new int[Size];
                int a = 0;
                int b = 0;
                while (a<Size) {
                    b++;
                    if (b%5 == 2) {
                        nums[a] = b;
                        System.out.println("Элемент массива ["+a+"] = " + nums[a]);
                        a++;
                    }
                }
                System.out.println("Конец массива.");
            }
            else {
                System.out.println("Некорректное значенние!");
            }
        }
        else {
            System.out.println("некорректное значенние");
        }
    }
}