package Lr_07_example10_02;

public class example10_02 {
    public static void main(String[] args) {
        superClass sClass = new superClass();
        sClass.toString();
        superClass sClass1 = new superClass("Текст супер класса ");
        sClass1.toString();
        subClass subClass1 = new subClass();
        subClass1.toString();
        subClass subClass2 = new subClass("Текст подкласса № 1 ");
        subClass2.toString();
        subClass subClass3 = new subClass(1);
        subClass3.toString();
        subClass subClass4 = new subClass("Текст подкласса № 2", 1);
        subClass4.toString();
    }
}