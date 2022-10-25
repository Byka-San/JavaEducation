package Lr_03;

import java.util.Scanner;
public class example10_03 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи\n");
        int x = id.nextInt();
        Fib.WhileFib(x);
        Fib.ForFib(x);
    }
    static class Fib {
        static void WhileFib(int x) {
            System.out.println("\n Версия программы на основе оператора while:");
            int a = x;
            long b = 0;
            long c = 1;
            long d = 1;
            while (a > 0) {
                System.out.printf("%d ", d);
                d = b + c;
                b = c;
                c = d;
                a--;
            }
            System.out.println("\nКонец цикла.");
        }

        //Второй варинат решение поставленной задачи с использованием оператора for в основе//

        static void ForFib(int x) {
            System.out.println("\nВерсия программы на основе оператора for:");
            long b = 0;
            long c = 1;
            long d = 1;
            for (int x1 = x; x1 > 0; --x1) {
                System.out.printf("%d ", d);
                d = b + c;
                b = c;
                c = d;
            }
            System.out.println("\nКонец цикла.");
        }
    }
}
