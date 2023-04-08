package Lr_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Random;

public class example_11 {
    public static void main(String[] args) {
        final int SIZE = 10000000;
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>(SIZE);
        HashSet<Integer> set = new HashSet<>(SIZE);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(SIZE);

        for (int i = 0; i < SIZE; i++) {
            int num = rand.nextInt(SIZE);
            list.add(num);
            set.add(num);
            map.put(i, num);
        }

        int index = SIZE / 2;

        long start = System.nanoTime();
        list.get(index);
        long end = System.nanoTime();
        System.out.println("ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        set.contains(list.get(index));
        end = System.nanoTime();
        System.out.println("HashSet: " + (end - start) + " ns");

        start = System.nanoTime();
        map.get(index);
        end = System.nanoTime();
        System.out.println("LinkedHashMap: " + (end - start) + " ns");
    }
}
