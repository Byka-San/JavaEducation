package Timus_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class example_1022 {
    public static List<Integer> a[];
    public static boolean marked[];
    public static List<Integer> sorted = new LinkedList();
    public static void DFS(int node) {
        if (!marked[node]) {

            for (Integer n : a[node]) {
                DFS(n);
            }
            marked[node] = true;
            sorted.add(0,node);
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        a = new List[N + 1];
        marked = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            int k = s.nextInt();
            a[i] = new ArrayList<Integer>();
            while (k != 0) {
                a[i].add(k);
                k = s.nextInt();
            }
        }
        for (int i = 1; i <= N; i++) {
            DFS(i);
        }
        for (Integer i : sorted) {
            System.out.printf("%d ", i);
        }
        s.close();
    }
}
