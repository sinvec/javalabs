package lr6;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки," +
                "которые Начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : ");
        for(String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = searchMatched(strings, "букв");

        System.out.println("\n" + "Строки, содержащие подстроку \"букв\" : ");
        for (String e: stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> searchMatched(List<String> list, String target) {
        return list.stream()
                .filter(s -> s.contains(target))
                .collect(Collectors.toList());
    }
}
