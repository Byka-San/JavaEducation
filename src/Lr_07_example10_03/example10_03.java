package Lr_07_example10_03;

public class example10_03 {
    public static void main(String[] args) {
        superClass superClass = new superClass(2);
        System.out.println(superClass.toString());
        subOneClass subOneClass = new subOneClass('a', 3);
        System.out.println(subOneClass.toString());
        subTwoClass subTwoClass = new subTwoClass('b', 4, "c");
        System.out.println(subTwoClass.toString());
    }
}

