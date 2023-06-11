package lr6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> integerAfter = squareList(integers);

        System.out.println("\n" + "Список после возведения в квадрат: " + "\n");
        for(Integer i: integerAfter) {
            System.out.println(i);
        }

    }

    public static List<Integer> squareList(List<Integer> list) {
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
