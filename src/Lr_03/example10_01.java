package Lr_03;

import java.util.Scanner;
public class example10_01 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите номер дня недели:");
        int day = id.nextInt();
        switch(day) {
            case 1:
                System.out.println("День недели - Понедельник");
                break;
            case 2:
                System.out.println("День недели - Вторник");
                break;
            case 3:
                System.out.println("День недели - Среда");
                break;
            case 4:
                System.out.println("День недели - Четверг");
                break;
            case 5:
                System.out.println("День недели - Пятница");
                break;
            case 6:
                System.out.println("День недели - Суббота");
                break;
            case 7:
                System.out.println("День недели - Воскресенье");
                break;
            default:
                System.out.println("Некорректное значение");
                break;
        }
    }
}
