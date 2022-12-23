package Timus;

import java.io.PrintStream;
import java.util.Scanner;
public class example10_1313 {
    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(System.in);
            PrintStream outFile = new PrintStream(System.out);
            int a = inFile.nextInt();
            int[][] m = new int[a][a];
            for (int i = 0; i < a; ++i) {
                for (int j = 0; j < a; ++j) {
                    m[i][j] = inFile.nextInt();
                }
            }
            for (int i = 0; i < 2*a; ++i) {
                int y = i;
                int x = 0;
                if (i >= a) {
                    y = a-1;
                    x = i-a+1;
                }
                while (y != -1 && x != a) {
                    outFile.print(m[y--][x++]);
                    if (i != 2*a-1) outFile.print(' ');
                }
            }
            inFile.close();
            outFile.close();
        }
        catch (Exception ex) {}
    }
}
