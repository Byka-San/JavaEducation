package Lr_05;

public class example10_01 {
    public static void main(String[] args) {
        Example Example1 = new Example();
        Example1.viewCode();

        Example1.Set('A');
        System.out.println("Char code = " + Example1.getCodeSymbol() + "\n");

        Example1.viewCode();
    }
}
class Example {
    private char ch;
    public void Set(char ch1) {
        this.ch = ch1;
    }
    public int getCodeSymbol() {
        return (int) ch;
    }
    public void viewCode() {
        System.out.println("ch1 = " + ch);
        System.out.println("ch1 = " + getCodeSymbol()+"\n");
    }
}
