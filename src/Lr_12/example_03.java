package Lr_12;

import java.util.List;
import java.util.stream.Collectors;


public class example_03 {
    public static void main(String[] args) {
        String string = "Ночь, улица, фонарь, аптека, " +
                "Бессмысленный и тусклый свет. " +
                "Живи еще хоть четверть века —." + "Всё будет так. Исхода нет.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n Строка после процесса сплитования: \n");
        for (String a: strings){
            System.out.println(a);
        }

        List<String> stringsAfter = A(strings);
        System.out.println("\n Строка после процесса преобразования: \n");
        for (String a: stringsAfter){
            System.out.print(a + " ");
        }
    }

    public static List<String> A(List<String> list){
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}