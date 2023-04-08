package Lr_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

    //Программа высчитывает время добавления в начало колекции 10 элементов

public class example_09_1 {
    public static void main(String[] args) {
        int size = 10000000;
        int numIterations = 10;
        long avgTime;

        HashSet<Integer> hashSet = new HashSet<>();
        avgTime = 0;
        for (int i = 0; i < numIterations; i++) {
            long startTime = System.nanoTime();
            for (int j = 0; j < 10; j++) {
                hashSet.add(j);
            }
            avgTime += (System.nanoTime() - startTime);
            hashSet.clear();
        }
        System.out.println("HashSet add to beginning time: " + (avgTime / numIterations));

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        avgTime = 0;
        for (int i = 0; i < numIterations; i++) {
            long startTime = System.nanoTime();
            for (int j = 0; j < 10; j++) {
                linkedHashMap.put(j, j);
            }
            avgTime += (System.nanoTime() - startTime);
            linkedHashMap.clear();
        }
        System.out.println("LinkedHashMap add to beginning time: " + (avgTime / numIterations));

        ArrayList<Integer> arrayList = new ArrayList<>();
        avgTime = 0;
        for (int i = 0; i < numIterations; i++) {
            long startTime = System.nanoTime();
            for (int j = 0; j < 10; j++) {
                arrayList.add(0, j);
            }
            avgTime += (System.nanoTime() - startTime);
            arrayList.clear();
        }
        System.out.println("ArrayList add to beginning time: " + (avgTime / numIterations));
    }
}