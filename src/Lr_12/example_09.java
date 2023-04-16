package Lr_12;

import java.util.List;
import java.util.stream.Collectors;

public class example_09 {
    public static void main(String[] args) {
        String string = "Ночь, улица, фонарь, аптека, " +
                "Бессмысленный и тусклый свет. " +
                "Живи еще хоть четверть века —." + "Всё будет так. Исхода нет.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n Строка после процесса сплитования: \n");
        for (String a: strings){
            System.out.println(a);
        }

        List<String> stringAfter = filterCapitalizedString(strings);
        System.out.println("\n Строка после процесса преобразования: \n");
        for (String a: stringAfter){
            System.out.println(a);
        }
    }

    private static List<String> filterCapitalizedString(List<String> list) {
        return list.stream()
                .filter(b -> b.matches("[а-яА-Яa-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
