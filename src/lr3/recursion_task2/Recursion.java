package lr3.recursion_task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursion {

    private static List<Integer> recList = new ArrayList<Integer>();

    private static Scanner stdin = new Scanner(System.in);

    public static void inputList() {
        if (recList.size() == 0) {
            System.out.print("Input first element of the recList: ");
        } else {
            System.out.print("Input next element of the recList: ");
        }
        recList.add(stdin.nextInt());
        System.out.print("Continue filling (y/n)? ");
        char c = stdin.next().charAt(0);
        if (c == 'y') {
            inputList();
        }
    }

    public static void main(String[] args) {

        inputList();

        System.out.print("recList is ");
        System.out.println(recList);
    }
}
