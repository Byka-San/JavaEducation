package Lr_07_example10_01;

public class example10_01 {
    public static void main(String[] args) {
        superClassTest superClassObject = new superClassTest("Передал в конструктор суперкласса.");
        String className = superClassObject.toString();
        System.out.println(className);

        subClassTest subClassObject1 = new subClassTest("Передал в конструктор подкласса.");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subClassTest subClassObject2 = new subClassTest("Передал в конструктор подкласса: ", "Где имеется два параметра.");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}