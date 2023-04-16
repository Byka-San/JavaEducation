package Lr_12;

import java.util.List;
import java.util.stream.Collectors;

public class example_07 {
    public static void main(String[] args) {
        String string = "Ночь, улица, фонарь, аптека, " +
                "Бессмысленный и тусклый свет. " +
                "Живи еще хоть четверть века —." + "Всё будет так. Исхода нет.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n Строка после процесса сплитования: \n");
        for (String a: strings){
            System.out.println(a);
        }

        int num = 5;
        List<String> stringAfter = filterCapitalizedString(strings, num);
        System.out.println("\n Строка после процесса преобразования: \n");
        for (String a: stringAfter){
            System.out.println(a);
        }
    }

    private static List<String> filterCapitalizedString(List<String> list, int c) {
        return list.stream()
                .filter(b -> b.length() > c)
                .collect(Collectors.toList());
    }
}
