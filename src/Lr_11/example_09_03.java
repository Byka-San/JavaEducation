package Lr_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class example_09_03 {
    public static void main(String[] args) {
        int N = 10000000;
        HashSet hashSet = new HashSet<>();
        ArrayList arrayList = new ArrayList<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        //HashSet
        long startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        long durationHashSet = (endTime - startTime);
        System.out.println("HashSet: " + durationHashSet);

        //ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        long durationArrayList = (endTime - startTime);
        System.out.println("ArrayList: " + durationArrayList);

        //LinkedHashMap
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            linkedHashMap.put(i, i);
        }
        endTime = System.nanoTime();
        long durationLinkedHashMap = (endTime - startTime);
        System.out.println("LinkedHashMap: " + durationLinkedHashMap);
    }
}
