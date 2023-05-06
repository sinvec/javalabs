package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter an array length: ");

        int[] nums = new int[stdin.nextInt()];
        float avg_sum = 0.f, avg_div = 0.f;

        try {
            for (int i = 0; i < nums.length; i++) {
                System.out.printf("Enter the number %d: ", i);
                nums[i] = stdin.nextInt();
                if (nums[i] >= 0) {
                    avg_sum += (float) nums[i];
                    avg_div += 1.f;
                }
            }
            // явно кидаем exception т.к. при работе с float он не вываливается (деление дает Nan либо Infinity)
            if (avg_div == 0.f) throw new ArithmeticException("Division by zero");
            System.out.printf("Avg of positive ints: %f", avg_sum / avg_div);
        } catch (InputMismatchException e) { // сюда же будут прилетать ошибки с несоотвествием типа
            System.out.println("ERROR: something was entered instead of an integer");
        } catch (ArithmeticException e) {
            System.out.println("ERROR: there is none of positive integers in the array");
        }
    }
}
