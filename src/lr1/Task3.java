package lr1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Input current day of the week, name of the current month and current day number:");
        String wday = stdin.next();
        String mname = stdin.next();
        int dnum = stdin.nextInt();

        System.out.printf("Date info: %s, %d, %s\n", wday, dnum, mname);
    }
}