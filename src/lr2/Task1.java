package lr2;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Input length of the new array:");
        int rarray_len = stdin.nextInt();
        int[] rarray = new Random().ints(rarray_len, 0, 100).toArray();
        int min_value = 100;
        System.out.print("Generated array: {");
        for(int i = 0; i < rarray_len; i++) {
            if (i == rarray_len - 1){
                System.out.printf("%d}\n", rarray[i]);
            } else {
                System.out.printf("%d, ", rarray[i]);
            }
            if (min_value > rarray[i]) {
                min_value = rarray[i];
            }
        }
        System.out.println("It has:");
        for(int i = 0; i < rarray_len; i++) {
            if (min_value == rarray[i]) {
                System.out.printf(" - min value %d with index %d\n", min_value, i);
            }
        }
    }
}
