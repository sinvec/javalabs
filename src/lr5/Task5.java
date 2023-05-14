package lr5;

public class Task5 {

    private static final int coresNumber = 4;
    private static Thread[] threads = new Thread[coresNumber];

    private static int[] maxList = new int[coresNumber];
    private static int globalMax = 0;

    public static void main(String[] args) throws InterruptedException{
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayLength = numberArray.length;
        for (int i = 0; i < coresNumber; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                int localMax = 0;
                for (int j = finalI; j < arrayLength; j += coresNumber) {
                    if (localMax < numberArray[j]) {
                        localMax = numberArray[j];
                    }
                }
                synchronized (maxList) {
                    maxList[finalI] = localMax;
                    maxList.notifyAll();
                }
            });
        }

        for (int i = 0; i < coresNumber; i++) {threads[i].start();}
        for (int i = 0; i < coresNumber; i++) {threads[i].join();}

        for (int i = 0; i < coresNumber; i++) {
            if (globalMax < maxList[i]) {
                globalMax = maxList[i];
            }
        }

        System.out.printf("Max of numberArray is %d", globalMax);
    }

}
