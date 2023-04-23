package Lr_13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example_06 {
    public static void main(String[] args) throws InterruptedException {
        fs a = new fs();
        a.run();
    }

    static class fs {
        public int sumCore1 = 0;
        public int sumCore2 = 0;
        public int sumCore3 = 0;
        public int sumCore4 = 0;
        public int sumCore5 = 0;
        public int sumCore6 = 0;

        public int fm = 0;
        public int[] arr;

        fs() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int sc = scanner.nextInt();
            int[] arr = new int[sc];
            Random random = new Random();
            for (int b = 0; b < sc; b++) {
                arr[b] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(arr));
            this.arr = arr;
        }

        public void run() throws InterruptedException {
            int n = this.arr.length / 6;
            System.out.println("Размер секции равен: " + n);
            Thread core1 = new Thread(() -> {
                for (int b = 0; b < n; b++) {
                    sumCore1 += this.arr[b];
                }
                fm += 1;
            });

            Thread core2 = new Thread(() -> {
                for (int c = n; c < 2 * n; c++) {
                    sumCore2 += this.arr[c];
                }
                fm += 1;
            });

            Thread core3 = new Thread(() -> {
                for (int d = 2 * n; d < 3 * n; d++) {
                    sumCore3 += this.arr[d];
                }
                fm += 1;
            });

            Thread core4 = new Thread(() -> {
                for (int e = 3 * n; e < 4 * n; e++) {
                    sumCore4 += this.arr[e];
                }
                fm += 1;
            });

            Thread core5 = new Thread(() -> {
                for (int f = 4 * n; f < 5 * n; f++) {
                    sumCore5 += this.arr[f];
                }
                fm += 1;
            });

            Thread core6 = new Thread(() -> {
                for (int q = 5 * n; q < this.arr.length; q++) {
                    sumCore6 += this.arr[q];
                }
                fm += 1;
            });

            core1.start();
            core2.start();
            core3.start();
            core4.start();
            core5.start();
            core6.start();

            Thread result = new Thread(() -> {
                while (true) {
                    if (fm == 6) {
                        System.out.println(sumCore1 + sumCore2 + sumCore3 + sumCore4 + sumCore5 + sumCore6);
                        break;
                    }
                }
            });

            while (true) {
                if (fm == 6) {
                    result.start();
                    result.join();
                    break;
                }
            }

            System.out.println("Сумма по ядрам равна:");
            System.out.println(sumCore1);
            System.out.println(sumCore2);
            System.out.println(sumCore3);
            System.out.println(sumCore4);
            System.out.println(sumCore5);
            System.out.println(sumCore6);

            System.out.print("Контрольная сумма равна: ");
            int summ = 0;
            for (int go = 0; go < this.arr.length; go++) {
                summ += this.arr[go];
            }
            System.out.println(summ);
        }
    }
}
