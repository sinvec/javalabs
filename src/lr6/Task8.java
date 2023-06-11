package lr6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> integerAfter = filterAbove(integers, 500);

        System.out.println("\n" + "Список чисел, больше 500: " + "\n");
        for(Integer i: integerAfter) {
            System.out.println(i);
        }

    }

    public static List<Integer> filterAbove(List<Integer> list, int bound) {
        return list.stream().filter(x -> x > bound).collect(Collectors.toList());
    }
}
