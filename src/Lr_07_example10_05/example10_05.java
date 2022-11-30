package Lr_07_example10_05;

public class example10_05 {
    public static void main(String[] args) {
        superClass superClass = new superClass("Текст супер класса");
        superClass.toString();
        subOneClass subOneClass = new subOneClass("Текст первого подкласса", 4);
        subOneClass.toString();
        subTwoClass subTwoClass = new subTwoClass("Текст второго подкласса", 'V');
        subTwoClass.toString();
    }
}

