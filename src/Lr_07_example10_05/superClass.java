package Lr_07_example10_05;

class superClass {
    final String str;

    public superClass(String str){
        this.str = str;
    }

    String getStr (){
        return str;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                        "- string = " + this.getStr();
        System.out.println(ClassNameAndFieldValue);
        return super.toString() + ClassNameAndFieldValue;
    }
}
