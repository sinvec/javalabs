package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Input your name:");
        String uname = stdin.nextLine();

        System.out.println("Input the year of birth:");
        int uyear = stdin.nextInt();

        System.out.printf("Your name is %s and your minimum age is %d", uname, Math.max(Year.now().getValue() - uyear - 1, 0));
    }
}