package Lr_04;

import java.util.Scanner;
public class example10_04 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int height = id.nextInt();
        int [][] graph = new int [height][];
        for (int a=0;a<graph.length;a++) {
            int b = a+1;
            graph[a]=new int[b];
        }
        for (int a =0; a < height; a++) {
            for (int b = 0; b <a+1; b++) {
                graph[a][b] = 0;
            }
        }
        for (int a =0; a < height; a++){
            for (int b = 0; b < graph[a].length; b++){
                System.out.print(graph[a][b]+" ");
            }
            System.out.println(" ");
        }
    }
}
