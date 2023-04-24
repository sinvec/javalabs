package lr3.example5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    private static int step = 0;
    public static int fact(int n) {
        int result = 0;
        space();
        System.out.println("" + n + "-> ");
        step++;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result =  fact(n - 1) + fact(n - 2);
        }
        step--;
        space();
        System.out.println("" + n + " <-");
        return result;
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print("  ");
        }
    }

}
