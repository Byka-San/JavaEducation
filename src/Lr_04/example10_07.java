package Lr_04;

import java.util.Scanner;
public class example10_07 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a =id.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = id.nextInt();
        int[][] ArrayZmeyka = new int[a][b];
        int tail = 0;
        int body = 0;
        int h = 0;
        for (int i = 0; h < ArrayZmeyka.length ; h++) {
            for (int j = 0; j <(ArrayZmeyka[i].length - tail); j++) {
                ArrayZmeyka[i][j] = body;
                body++;
            }
            if(i< ArrayZmeyka.length-1) {
                i++;}
            for (int o=a-1; o > tail; o--) {
                ArrayZmeyka[o][ArrayZmeyka[i].length-1-tail] = body;
                body++;
            }
            tail++;
        }
        for (int i = 0; i < ArrayZmeyka.length; i++) {
            int count = i+1;
            System.out.print("номер строки: " + count + " : ");
            for (int j = 0; j < ArrayZmeyka[i].length; j++){
                System.out.print(ArrayZmeyka[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
