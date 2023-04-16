package Lr_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class example_04 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("\n" + "Список до необходимого преобразования: " + "\n");
        for (int a = 0; a < 10; a++){
            integers.add(random.nextInt(500));
            System.out.println(integers.get(a));
        }

        List<Integer> integersAfter = squareList(integers);
        System.out.println("\nСписок после возведения в квадрат: \n");
        for (Integer a: integersAfter){
            System.out.println(a);
        }
    }

    public static List<Integer> squareList(List<Integer> list){
        return list.stream().map(b -> b * b).collect(Collectors.toList());
    }
}
