package Lr_09.Example_2;
import java.util.Scanner;
public class example10_01 {
    public static int summ(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum/arr.length;
    }
    public static void b() {
        System.out.print("Введите количество элементов данного массива: ");
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int numb, count = 0;
        int[] arr = new int[c];
        for (int a = 0; a < c; a++) {
            count++;
            System.out.print("Введите число #"+count+": ");
            numb = scan.nextInt();
            if (numb < 0) {
                throw new NegativeArraySizeException("Число меньше 0");
            }
            arr[a] = numb;
        }
        System.out.println(summ(arr));
    }
    public static void main(String[] args) {
        try {
            b();
        } catch(NegativeArraySizeException e) {
            System.out.println("Введено отрицательное значение числа");
        } catch (Exception e){
            System.out.println("Введен не верный вид числа");
        }
    }
}
