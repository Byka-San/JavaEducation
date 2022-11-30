package Lr_07_example10_05;

public class subTwoClass extends superClass {

    final char ch;

    public subTwoClass(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    char getChar (){
        return ch;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                        "- string = " + this.getStr() + "\n" +
                        "- char = " + getChar();
        System.out.println(ClassNameAndFieldValue);
        return super.toString() + ClassNameAndFieldValue;
    }
}
