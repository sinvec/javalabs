package lr5;

public class Task4 {
    public static void main(String[] args){
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
