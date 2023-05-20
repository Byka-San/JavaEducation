package Timus_2;

import java.util.Scanner;
import static java.lang.Math.*;
public class example_1362 {
    public static double One(double a, double b, double c, double d) {
		return PI*pow(d, 2)*((b - a) + 1/(3.0*pow(c, 2))*(pow(a, 3) - pow(b, 3)));
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double z = s.nextDouble();
        double c = s.nextDouble();
        int    n = s.nextInt();
        double dx = c/n;
        double x  = -c/2 + dx;
        while (x <= c/2 + 0.000001) {
            System.out.printf("%.6f\n", One(x - dx, x, c/2, z/2));
            x += dx;
        }
        s.close();
    }
}
