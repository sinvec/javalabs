package lr1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Input two integers via white space:");
        int     a = stdin.nextInt(),
                b = stdin.nextInt();
        System.out.printf(
                "Their sum is %d and the difference is %d",
                a + b,
                a - b);
    }
}