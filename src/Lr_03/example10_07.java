package Lr_03;

import java.util.Arrays;
public class example10_07 {
    public static void main(String[] args) {
        int Size = 10;
        char chars[] = new char[Size];
        char b = 's';
        for (int a = 0; a < Size; b--) {
            if (b % 2 == 1)
            {
                chars[a] = b;
                System.out.println("Элемент массива [" + a + "] = " + chars[a]);
                a++;
            }
        }
        System.out.println("конец массива\n");
        Arrays.sort(chars);
        System.out.println("Произведена сортировка массива");
        for (int a = 0; a < chars.length; a++) {
            System.out.println("Элемент массива [" + a + "] после сортировки = " + chars[a]);
        }
        System.out.println("конец массива");
    }
}