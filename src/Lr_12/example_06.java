package Lr_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example_06 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\nПервоначальный список чисел: \n");

        for (int a = 0; a < 10; a++){
            integers.add(random.nextInt(500));
            System.out.println(integers.get(a));
        }

        System.out.println("\n На какое число необходимо выполнить деление?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        List<Integer> integersAfter = squareList(integers, num);

        System.out.println("\nСписок после возведения в квадрат: \n");

        for (Integer a: integersAfter){
            System.out.println(a);
        }
    }

    public static List<Integer> squareList(List<Integer> list, int num){
        return list.stream().filter(x -> x % num == 0).collect(Collectors.toList());
    }
}