package Lr_11;

import java.util.ArrayList;

public class example_07_01 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int k = 0;
        while (list.size() > 1) {
            k = (k + 1) % list.size();
            list.remove(k);
        }
        System.out.println("Оставшийся человек: " + list.get(0));
    }
}