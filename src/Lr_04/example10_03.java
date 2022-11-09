package Lr_04;

import java.util.Scanner;
public class example10_03 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = id.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int height = id.nextInt();
        int [][] graph = new int [height][width];

        for (int i =0; i < height; i++) {
            for (int j = 0; j <width; j++) {
                graph[i][j] = 2;
            }
        }
        for (int i =0; i < height; i++) {
            System.out.print("");
            for (int j = 0; j <width; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
