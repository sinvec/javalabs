package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Input the year of birth:");
        int uyear = stdin.nextInt();

        System.out.printf("Your minimum age is %d", Math.max(Year.now().getValue() - uyear - 1, 0));
    }
}