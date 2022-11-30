package Lr_07_example10_04;

public class example10_04 {
    public static void main(String[] args) {
        superClass superClass = new superClass('B');
        System.out.println(superClass.toString());
        subOneClass subOneClass = new subOneClass('a',"Da");
        System.out.println(subOneClass .toString());
        subTwoClass subTwoClass = new subTwoClass('C',"net",6);
        System.out.println(subTwoClass .toString());
    }
}
