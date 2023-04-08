package Lr_11;

import java.util.*;

public class example_10_03 {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            hashSet.add(i);
            linkedHashMap.put(i, i);
            arrayList.add(i);
        }

        long startTime, endTime;

        //HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet removal time: " + (endTime - startTime));

        //LinkedHashMap
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            linkedHashMap.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashMap removal time: " + (endTime - startTime));

        //ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList removal time: " + (endTime - startTime));
    }
}
