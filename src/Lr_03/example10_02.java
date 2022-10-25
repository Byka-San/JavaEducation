package Lr_03;

import java.util.Scanner;
public class example10_02 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = id.nextLine();
        switch (day) {
            case "Понедельник":
                System.out.println("Первый день недели");
                break;
            case "Вторник":
                System.out.println("Второй день недели");
                break;
            case "Среда":
                System.out.println("Третий день недели");
                break;
            case "Четверг":
                System.out.println("Четвёртый день недели");
                break;
            case "Пятница":
                System.out.println("Пятый день недели");
                break;
            case "Суббота":
                System.out.println("Шестой день недели");
                break;
            case "Воскресенье":
                System.out.println("Седьмой день недел");
                break;
            default:
                System.out.println("Такого дня недели нет");
                break;
        }
    }
}
