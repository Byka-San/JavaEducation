package Lr_07_example10_05;


public class subOneClass extends superClass {
    final int num;
    public subOneClass(String str, int num) {
        super(str);
        this.num = num;
    }

    int getInt(){
        return num;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                        "- string = " + getStr() + "\n" +
                        "- Number = " + getInt();
        System.out.println(ClassNameAndFieldValue);
        return super.toString() + ClassNameAndFieldValue;
    }
}