package Lr_11;

import java.util.HashMap;

public class example_06 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "1");
        hashMap.put(2, "2");
        hashMap.put(3, "3");
        hashMap.put(4, "4");
        hashMap.put(5, "5");
        hashMap.put(6, "шесть");
        hashMap.put(7, "семь");
        hashMap.put(8, "восемь");
        hashMap.put(9, "девять");
        hashMap.put(10, "десять");

        StringBuilder stringBuilder = new StringBuilder();
        int multiplication = 1;

        for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (entry.getKey() > 5) {
                if (entry.getValue().length() > 5) {
                    multiplication *= entry.getKey();
                }
            } else if (entry.getKey() == 0) {
                stringBuilder.append(entry.getValue()).append(",");
            }
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            System.out.println("Values with key = 0: " + stringBuilder.toString());
        }

        System.out.println("Multiplication of keys with values length > 5: " + multiplication);
    }
}