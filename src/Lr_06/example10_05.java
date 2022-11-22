package Lr_06;

public class example10_05 {public static void main(String[] args) {
    System.out.print("Расчет без рекурсии для числа 5: ");
    square.doit(5);
    System.out.print("Расчет без рекурсии для числа 10: ");
    square.doit(10);
    squareReqursion.Counting(5);
    squareReqursion.Output();
    squareReqursion.Null();
    squareReqursion.Counting(10);
    squareReqursion.Output2();
    squareReqursion.Null();
}


    static class square {
        static void doit(int num) {
            int count = 0;
            while (num > 0) {
                count += num * num;
                num--;
            }
            System.out.println(count);
        }
    }


    static class squareReqursion {
        static int count = 0;
        static void Counting (int num) {
            if (num > 0) {
                count += num * num;
                Counting(num - 1);
            }
        }
        static void Output() {
            System.out.println("Решение с рекурсией для числа 5: " + count);
        }
        static void Output2() {
            System.out.println("Решение с рекурсией для числа 10: " + count);
        }
        static void Null() {
            count = 0;
        }
    }
}