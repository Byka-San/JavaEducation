package Lr_11;

import java.util.LinkedList;

public class example_07_02 {
    public static void main(String[] args) {
        int n = 10;
        LinkedList<Integer> list = new LinkedList<Integer>();
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
