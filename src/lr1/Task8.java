package lr1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Input two integers via white space:");
        System.out.printf("Their sum is %d", stdin.nextInt() + stdin.nextInt());
    }
}
