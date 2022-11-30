package Lr_07_example10_03;

public class superClass {
    int num;

    superClass(int num) {
        setValue(num);
    }

    public superClass() {
    }

    void setValue(int num) {
        this.num = num;
    }

    int getInt() {
        return num;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Имя класса: " + this.getClass().getSimpleName() + "\n" + " int 1 = " + this.getInt();
        return ClassNameAndFieldValue;
    }
}
