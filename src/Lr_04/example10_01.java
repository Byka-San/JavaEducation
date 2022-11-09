package Lr_04;

public class example10_01 {
    public static void main(String[] args){
        int rows = 11;
        int columns =23;
        int a;
        for (int b = 1; b<= rows; b++){
            a = 0;
            for (int c = 1; c <=columns; c++){
                System.out.print("-");
                a = a + 1;
            }
            System.out.println(" ");
        }
    }
}
