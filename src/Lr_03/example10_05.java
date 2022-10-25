package Lr_03;

import java.util.Scanner;
import java.util.Random;
public class example10_05 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел в сумме");
        int a = id.nextInt();

        CalcNums.WhileCalcNums(a);
        CalcNums.ForCalcNums(a);
    }

    private static class CalcNums {
        private static void WhileCalcNums(int a) {
            System.out.println("Вариант программы на основе оператора while:");
            int sum = 0;
            Random random = new Random();
            int a1 = a;
            while (a1 > 0) {
                int nums = random.nextInt(1000);
                if (nums % 5 == 2 || nums % 3 == 1) {
                    System.out.printf("%d, ", nums);
                    sum = sum + nums;
                    a1--;
                }
            }
            System.out.printf("Сумма чисел: %d", sum);
        }

        private static void ForCalcNums(int a) {
            System.out.println("\nВариант программы на основе оператора for");
            int sum = 0;
            for (int i = 0; a > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d, ", i);
                    sum = sum + i;
                    a--;
                }
            }
            System.out.printf("Сумма чисел: %d", sum);
        }
    }
}