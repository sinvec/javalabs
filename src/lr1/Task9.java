package lr1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Input the integer:");
        int userint = stdin.nextInt();

        System.out.printf(
                "%d %d %d %d",
                userint - 1,
                userint,
                userint + 1,
                9 * userint * userint
        );
    }
}
