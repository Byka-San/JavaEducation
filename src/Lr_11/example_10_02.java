package Lr_11;

import java.util.*;

public class example_10_02 {
    public static void main(String[] args) {
        int size = 10000000;
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int value = random.nextInt();
            hashSet.add(value);
            linkedHashMap.put(i, value);
            arrayList.add(value);
        }
        long startTime, endTime;

        // HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            int index = size / 2 + i;
            hashSet.remove(index);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet remove time: " + (endTime - startTime));

        // LinkedHashMap
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            int index = size / 2 + i;
            linkedHashMap.remove(index);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashMap remove time: " + (endTime - startTime));

        // ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            int index = size / 2 + i;
            arrayList.remove(index);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList remove time: " + (endTime - startTime));
    }
}