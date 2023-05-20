package Timus_2;

import java.util.Scanner;
public class example_1024 {
    public static long One(long a, long b) {
        if (b == 0)
            return a;
        return One(b, a % b);
    }
    public static long lcm(long[] a, int n) {
        long u = 1;
        for (int i = 0; i < n; i++) {
            u = u * a[i] / One(u, a[i]);
        }
        return u;
    }
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int N   = q.nextInt();
        int p[]  = new int[N + 1];
        long w[] = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            p[i] = q.nextInt();
        }
        w[0] = 1;
        for (int i = 1; i <= N; i++) {
            int m = p[i];
            w[i]  = 1;
            while (m != i) {
                m = p[m];
                w[i]++;
            }
        }

        System.out.println(lcm(w, N + 1));
    }
}
