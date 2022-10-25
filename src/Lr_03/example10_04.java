package Lr_03;

import java.util.Scanner;
public class example10_04 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите первое число");
        int a = id.nextInt();
        System.out.println("Ввведите второе число");
        int b = id.nextInt();

        SortNums.WhileSortNums(a, b);
        SortNums.ForSortNums(a, b);
    }
    static class SortNums {
        static void WhileSortNums(int a, int b) {
            System.out.println("\nВерсия программы на основе оператора while:");
            if (a > b) {
                while (b <= a) {
                    System.out.printf("%d, ", b);
                    b++;
                }
            }
            else {
                while (a <= b) {
                    System.out.printf("%d, ", a);
                    a++;
                }
            }
            System.out.println("Конец числового ряда.");
        }

        static void ForSortNums(int a, int b) {
            System.out.println("\nВерсия программы на основе оператора for:");
            if (a > b) {
                for (int b1 = b; b1 <= a; b1++) {
                    System.out.printf("%d, ", b1);
                }
            } else {
                for (int a1 = a; a1 <= b; a1++) {
                    System.out.printf("%d, ", a1);
                }
            }
            System.out.println("Конец числового ряда.");
        }
    }
}

