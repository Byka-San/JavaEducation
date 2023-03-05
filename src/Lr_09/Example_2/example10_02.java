package Lr_09.Example_2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class example10_02 {
    public static void main(String[] args) {
        int[][] isArr;
        Random random = new Random();
        Scanner l = new Scanner(System.in);
        try {
            System.out.println("Введите количество столбцов в массиве: ");
            int column = l.nextInt();
            System.out.println("Введите количество строк в массиве: ");
            int line = l.nextInt();
            isArr = new int[line][column];
            for (int a = 0; a < line; a++){
                for (int b = 0; b < column; b++){
                    isArr[a][b] = random.nextInt(200);
                }
            }

            for (int a = 0; a < line; a++){
                for (int b = 0; b < column; b++){
                    System.out.print(" " + isArr[a][b] + " ");
                }
                System.out.println();
            }

            System.out.println("Введите необходимый номер столбца для вывода: ");
            int num = l.nextInt() - 1;
            for (int a = 0; a < line; a++){
                System.out.println(isArr[a][num]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Номер столбца находится за пределами массива");
        }
        catch (InputMismatchException e){
            System.out.println("Введено некорректное число");
        }
    }
}
