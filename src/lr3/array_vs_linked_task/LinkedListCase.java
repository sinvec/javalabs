package lr3.array_vs_linked_task;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCase {
    public static void main(String[] args) {
        List<Integer> guys = new LinkedList<>();

        int N = 200000;
        for (int i = 0; i < N; i++) {
            guys.add(i);
        }

        boolean isSecond = false;

        while (guys.size() != 1) {
            for (int i = 0; i < guys.size(); i++) {
                if (isSecond) {
                    guys.remove(i);
                    isSecond = false;
                } else {
                    isSecond = true;
                }
            }
        }

        System.out.println(guys);
    }
}
