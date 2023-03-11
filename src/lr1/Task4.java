package lr1;

import java.util.Scanner;
import java.time.YearMonth;
public class Task4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Input name of the current month and number of days in the month:");
        String mname = stdin.next();
        int dnum = stdin.nextInt();

        int monthnumber = switch (mname) {
            case "January"   ->   1;
            case "February"  ->   2;
            case "March"     ->   3;
            case "April"     ->   4;
            case "May"       ->   5;
            case "June"      ->   6;
            case "July"      ->   7;
            case "August"    ->   8;
            case "September" ->   9;
            case "October"   ->  10;
            case "November"  ->  11;
            case "December"  ->  12;
            default -> throw new IllegalStateException("Invalid month name: " + mname);
        };

        if (dnum == YearMonth.of(2023, monthnumber).lengthOfMonth()) {
            System.out.printf("Entered month name DOES match to the entered number of days");
        } else {
            System.out.printf("Entered month name DOES NOT match to the entered number of days");
        }
    }
}