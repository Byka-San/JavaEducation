package Lr_06;

public class example10_07 {
    public static void main(String[] args) {
        char[] test = new char[]{'F','{','|'};
        System.out.print("Коды символов F, {, | :  ");
        for (int a=0;a< test.length;a++){
            System.out.print(Pro.StaticMethod(test)[a] + " ");
        }
    }
    static class Pro{
        static int[] StaticMethod(char[] ic){
            int[] arg = new int[ic.length];
            for (int a=0;a<arg.length;a++){
                arg[a]=ic[a];
            }
            return arg;
        }
    }
}