package lr3.banchmark_task;

import java.util.*;

public class ArrayDequeBench {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        TreeSet<Integer> sortedSet = new TreeSet<>();
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();

        System.out.println("Время выполнения операции вставки в начало arrayDeque = " + AddFirstDequeTest(arrayDeque));
        System.out.println("Время выполнения операции вставки в конец arrayDeque = " + AddLastDequeTest(arrayDeque));

        System.out.println("Время выполнения операции удаления в начале arrayDeque = " + removeFirstDequeTest(arrayDeque));
        System.out.println("Время выполнения операции удаления в конце arrayDeque = " + removeLastDequeTest(arrayDeque));

        System.out.println("Время выполнения операции добавления в sortedSet = " + AddSortedSetTest(sortedSet));
        System.out.println("Время выполнения операции удаления в начале sortedSet = " + removeFirstSortedSetTest(sortedSet));

        System.out.println("Время выполнения операции добавления в sortedSet = " + AddSortedSetTest(sortedSet));
        System.out.println("Время выполнения операции удаления в конце sortedSet = " + removeLastSortedSetTest(sortedSet));

        System.out.println("Время выполнения операции добавления в sortedMap = " + AddSortedMapTest(sortedMap));
        System.out.println("Время выполнения операции удаления в начале sortedMap = " + removeFirstSortedMapTest(sortedMap));

        System.out.println("Время выполнения операции добавления в sortedMap = " + AddSortedMapTest(sortedMap));
        System.out.println("Время выполнения операции удаления в конце sortedMap = " + removeLastSortedMapTest(sortedMap));

        System.out.println("Время выполнения операции добавления в sortedMap = " + AddSortedMapTest(sortedMap));
        System.out.println("Время выполнения операции получения элеметов по ключу в sortedMap = " + getSortedMapTest(sortedMap));
    }

    private static long AddFirstDequeTest(Deque<Integer> deq) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 19000000; i++) {
            deq.offerFirst(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long AddLastDequeTest(Deque<Integer> deq) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 19000000; i++) {
            deq.offerLast(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeFirstDequeTest(Deque<Integer> deq) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < 19000000; i++) {
            deq.removeFirst();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeLastDequeTest(Deque<Integer> deq) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < 19000000; i++) {
            deq.removeLast();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long AddSortedSetTest(SortedSet<Integer> set) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 10000000; i++) {
            set.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeFirstSortedSetTest(TreeSet<Integer> set) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < 10000000; i++) {
            set.pollFirst();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeLastSortedSetTest(TreeSet<Integer> set) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < 10000000; i++) {
            set.pollLast();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long AddSortedMapTest(TreeMap<Integer, Integer> map) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 10000000; i++) {
            map.put(i, i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeFirstSortedMapTest(TreeMap<Integer, Integer> map) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < 10000000; i++) {
            map.pollFirstEntry();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeLastSortedMapTest(TreeMap<Integer, Integer> map) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < 10000000; i++) {
            map.pollLastEntry();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getSortedMapTest(TreeMap<Integer, Integer> map) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция получения по ключу
        for (int i = 0; i < 10000000; i++) {
            map.get(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
