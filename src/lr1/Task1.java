package lr1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Input first name:");
        String fname = stdin.nextLine();

        System.out.println("Input second name:");
        String sname = stdin.nextLine();

        System.out.println("Input middle name:");
        String mname = stdin.nextLine();

        System.out.printf("Hello %s %s %s \n", fname, sname, mname);
    }
}
