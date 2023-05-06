package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int [][] matrix = {{1, 2}, {3, 4}};

        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter matrix column index: ");

        try {

            int cIndex = stdin.nextInt();

            System.out.printf("Column %d: ", cIndex);
            for (int i = 0; i < matrix.length; i++) {
                System.out.printf("%d ", matrix[i][cIndex]);
            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR: something was entered instead of an integer");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: index out of range");
        }
    }
}
