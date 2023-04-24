package lr3.recursion_task1;

public class Recursion {

    public static String to_binary(int n) {
        if (n / 2 == 0) {
            return String.valueOf(n % 2);
        } else {
            return to_binary(n / 2) + String.valueOf(n % 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(to_binary(15));
    }

}
