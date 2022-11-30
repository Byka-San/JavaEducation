package Lr_07_example10_04;

public class superClass {
    char ch;

    superClass (char ch){
        setCh (ch);
    }

    public superClass() {
    }

    void setCh(char ch){
        this.ch = ch;
    }

    char getCh (){
        return ch;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Имя класса: " + this.getClass().getSimpleName() + "\n" +
                        " char = " + this.getCh();
        return ClassNameAndFieldValue;
    }
}
