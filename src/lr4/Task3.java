package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter an array length: ");

        byte[] nums = new byte[stdin.nextInt()];
        int nums_sum = 0;

        try {
            for (int i = 0; i < nums.length; i++) {
                System.out.printf("Enter the byte %d: ", i);
                nums[i] = stdin.nextByte();
                nums_sum += nums[i];
            }
            System.out.printf("Sum of entered bytes: %d", nums_sum);
        } catch (InputMismatchException e) { // сюда же будут прилетать ошибки с несоотвествием типа
            System.out.println("ERROR: something was entered instead of an byte");
        }
    }
}
