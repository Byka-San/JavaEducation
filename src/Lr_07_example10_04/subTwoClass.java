package Lr_07_example10_04;

public class subTwoClass extends subOneClass {

    int num;

    public void setCharStrInt (char ch, String str, int num){
        super.ch = ch;
        super.str = str;
        this.num = num;
    }
    subTwoClass (char ch, String str, int num){
        super(ch,str);
        this.setCharStrInt(super.ch,super.str, num);
    }

    public int getInt() {
        return num;
    }

    public String toString() {
        String ThirdFieldValue =
                "\n num = " + this.getInt();
        return super.toString()+ThirdFieldValue;
    }
}