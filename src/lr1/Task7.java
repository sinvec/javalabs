package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Input your age:");
        int uage = stdin.nextInt();

        System.out.printf(
                "Your birth year is either %d or %d",
                Year.now().getValue() - uage - 1,
                Year.now().getValue() - uage
        );
    }
}