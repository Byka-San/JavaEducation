package Lr_06;

public class example10_09 {
    public static void main(String[] args) {
    char[] vpered = new char[]{'a', 'b', 'c'};
    System.out.println(Program.Method(vpered));
    char[] nazad = new char[]{'a', 'b', 'c'};
    System.out.println(Program2.MethodZad(nazad));
}


    static class Program {
        static char[] Method(char[] chars) {
            for (int d = 0; chars.length > d; d++) {
            }
            return chars;
        }
    }


    static class Program2 {
        static char[] MethodZad(char[] chars) {
            char[] newChars = new char[chars.length];
            for (int d = 0; d < chars.length; d++) {
                newChars[d] = chars[chars.length - d - 1];
            }
            return newChars;
        }
    }
}