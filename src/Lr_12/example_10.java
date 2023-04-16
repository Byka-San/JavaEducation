package Lr_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example_10 {
    public static void main(String[] args) {
        List<Integer> b = new ArrayList<>();
        Random random = new Random();
        System.out.println("\nПервоначальный список чисел: \n");
        for (int a = 0; a < 10; a++){
            b.add(random.nextInt(500));
            System.out.println(b.get(a));
        }

        System.out.println("\n Введите максимальное");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> integersAfter = squareList(b, num);
        System.out.println("\nСписок после возведения в квадрат: \n");
        for (Integer a: integersAfter){
            System.out.println(a);
        }
    }

    public static List<Integer> squareList(List<Integer> list, int d){
        return list.stream().filter(v -> v < d).collect(Collectors.toList());
    }
}
