package Lr_11;

import java.util.*;
public class example_09_02 {
    public static void main(String[] args) {
        int collectionSize = 10000000;
        int numOfOperations = 10;
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < collectionSize; i++) {
            hashSet.add(i);
            linkedHashMap.put(i, i);
            arrayList.add(i);
        }
        long startTime = 0, endTime = 0, duration = 0;

        // HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < numOfOperations; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("HashSet: " + duration);

        // LinkedHashMap
        startTime = System.nanoTime();
        for (int i = 0; i < numOfOperations; i++) {
            linkedHashMap.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedHashMap: " + duration);

        // ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < numOfOperations; i++) {
            arrayList.add(0, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration);
    }
}