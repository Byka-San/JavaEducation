package Lr_03;

public class example10_08 {
    public static void main(String[] args) {
        int Size = 10;
        char chars[] = new char[Size];
        char a = 'A';
        char ExChars [] = {'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int b = 0; b < chars.length; a++) {
            for (int c = 0; c < ExChars.length; c++) {
                if (a == ExChars[c]) {
                    a++;
                }
            }
            chars[b] = a;
            System.out.println("Элемент массива ["+b+"] = " + chars[b]);
            b++;
        }
        System.out.println("Конец массива.");
    }
}