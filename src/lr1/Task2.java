package lr1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Input name:");
        String name = stdin.nextLine();

        System.out.println("Input age:");
        int age = stdin.nextInt();

        System.out.printf("Hello %s, your age is %d\n", name, age);
    }
}