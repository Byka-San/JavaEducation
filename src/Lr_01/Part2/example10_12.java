package Lr_01.Part2;

import java.util.Scanner;
public class example10_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("число a: ");
        int a = in.nextInt();
        System.out.print("число b: ");
        int b = in.nextInt();
        long area = Math.round(Math.E * hyp(a,b));
        System.out.printf("Гипатинуза равна: %s", area);
    }
    private static double hyp(double x, double y){
        return Math.exp(y*Math.log(x));
    }
}
