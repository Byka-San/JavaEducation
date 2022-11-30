package Lr_07_example10_01;

public class superClassTest {
    private String str1;
    superClassTest(String strEx) {
        this.str1 = strEx;
    }

    superClassTest() {
        this.str1 = "Нет параметров";
    }
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
