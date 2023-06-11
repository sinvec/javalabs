package lr6;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {

        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки," +
                "которые Начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : ");
        for(String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterWithLettersOnly(strings);

        System.out.println("\n" + "Строки состоящие только из букв : ");
        for (String e: stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterWithLettersOnly(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[а-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
