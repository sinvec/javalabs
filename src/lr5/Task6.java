package lr5;

public class Task6 {

    private static final int coresNumber = 4;
    private static Thread[] threads = new Thread[coresNumber];

    private static int[] sumList = new int[coresNumber];
    private static int globalSum = 0;

    public static void main(String[] args) throws InterruptedException{
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayLength = numberArray.length;
        for (int i = 0; i < coresNumber; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = finalI; j < arrayLength; j += coresNumber) {
                    localSum += numberArray[j];
                }
                synchronized (sumList) {
                    sumList[finalI] = localSum;
                    sumList.notifyAll();
                }
            });
        }

        for (int i = 0; i < coresNumber; i++) {threads[i].start();}
        for (int i = 0; i < coresNumber; i++) {threads[i].join();}

        for (int i = 0; i < coresNumber; i++) {
            globalSum += sumList[i];
        }

        System.out.printf("Sum of numberArray is %d", globalSum);
    }
}
