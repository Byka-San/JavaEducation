package Lr_06;

public class example10_01 {
    public static void main(String[] args) {

        char[] t1 = new char[]{'a','b','c'};
        char[] t2 = new char[]{'a'};

        System.out.println("1) ");
        Argum first = new Argum();
        first.setArgum('a');
        first.getArgum();
        System.out.println("2) ");
        Argum second = new Argum();
        second.setArgum("Строка");
        second.getArgum();
        System.out.println("3) ");
        Argum uno = new Argum();
        uno.setArgum(t1);
        uno.getArgum();
        System.out.println("4) ");
        Argum dos = new Argum();
        dos.setArgum(t2);
        dos.getArgum(); }

    static class Argum {
        char symb ;
        String string ;
        void setArgum(char symb){
            this.symb = symb;
        }
        void setArgum(String string){
            this.string = string;
        }
        void setArgum(char[] chars){
            if (chars.length == 0){
                this.symb = chars[0];
            }
            else if(chars.length>1){
                String temp = new String(chars);
                string = temp;
            }
        }
        void getArgum(){

            System.out.println("Вывод символа: " + symb);
            System.out.println("Вывод строки: " + string);
        }
    }
}