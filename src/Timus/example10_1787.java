package Timus;

import java.util.Scanner;
public class example10_1787 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int k = in.nextInt();
        int n = in.nextInt();
        int car = 0;
        int [] cars = new int [n];
        for (int i = 0; i< n; i++){
            cars[i] += in.nextInt();
        }

        for (int i = 0; i < n; i++){
            car += cars[i];
            if ((car -k)<0 ){
                car = 0;
            }
            else {
                car -= k;
            }
        }
        System.out.print(car);
    }
}
