package Lr_11;

import java.util.*;

public class example_10_01 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int numElements = 10000000;
        for (int i = 0; i < numElements; i++) {
            hashSet.add(i);
            linkedHashMap.put(i, i);
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            hashSet.remove(numElements - 1 - i);
        }
        long endTime = System.nanoTime();
        long hashSetTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            linkedHashMap.remove(numElements - 1 - i);
        }
        endTime = System.nanoTime();
        long linkedHashMapTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            arrayList.remove(numElements - 1 - i);
        }
        endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        System.out.println("Time to remove 10 elements from HashSet: " + hashSetTime);
        System.out.println("Time to remove 10 elements from LinkedHashMap: " + linkedHashMapTime);
        System.out.println("Time to remove 10 elements from ArrayList: " + arrayListTime);
    }
}
