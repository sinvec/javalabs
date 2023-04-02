package lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Input two dimensions of the array and its init value via white space:");
        int     a = stdin.nextInt(),
                b = stdin.nextInt(),
                init_value = stdin.nextInt();
        int[][] snake_array = new int[a][b];
        System.out.println("Snake array:");
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                if (x % 2 == 0) {
                    snake_array[x][y] = init_value + y + x * b;
                } else {
                    snake_array[x][y] = init_value + (x + 1) * b - y - 1;
                }
                System.out.printf("%2d ", snake_array[x][y]);
            }
            System.out.println();
        }
    }
}
