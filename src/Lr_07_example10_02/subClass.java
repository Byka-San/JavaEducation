package Lr_07_example10_02;

 public class subClass extends superClass {
     private int num;
     private String str;

     subClass() {
         setString();
     }

     subClass(String str) {
         setString(str);
     }

     subClass(int num) {
         setInt(num);
     }

     subClass(String str, int num) {
         setString(str);
         setInt(num);
     }

     public void setInt(int num) {
         this.num = num;
     }

     public int getInt() {
         return num;
     }

     public void setString() {
         this.str = "Нет данных";
     }

     public void setString(String str) {
         this.str = str;
     }

     public String getString() {
         return str;
     }

     public int strLength() {
         return str.length();
     }

     public void Show() {
         System.out.println(num);
         System.out.println(str);
     }

     public String toString() {
         String ClassNameAndFieldValue = "subClassTest { " + "str2 = \"" + getString() + '\"' + " string.length = " + "\"" + strLength() + "\"}"
                 + "\n \n subClassTest { " + "int1 = \"" + getInt() + "\"}";
         System.out.println(ClassNameAndFieldValue);
         return ClassNameAndFieldValue;
     }
 }
