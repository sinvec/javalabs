package lr6;

import java.util.Arrays;
import java.util.Random;
public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt();
        }

        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterMultiplies(arr, 5);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filterMultiplies(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(x -> x % divisor == 0).toArray();
    }
}