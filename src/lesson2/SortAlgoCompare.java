package lesson2;

import java.util.Random;

public class SortAlgoCompare {
    private static int N = 7000;
    private static int M = 25;
    private static int A = -7000;
    private static int B = 7000;

    public static void main(String[] args) {
        long[] sortSelectTimers = new long[M];
        long[] sortInsertionTimers = new long[M];
        long sortSelectTotalTimers = 0;
        long sortInsertionTotalTimers = 0;

        for (int i = 0; i < M; i++) {
            MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
            randomListFill(myArrayList1, N, A, B);
            MyArrayList<Integer> myArrayList2 = new MyArrayList<>(myArrayList1);

            long start = System.currentTimeMillis();
            myArrayList1.selectionSort(Integer::compareTo);
            long end = System.currentTimeMillis();
            sortSelectTimers[i] = end - start;
            sortSelectTotalTimers += sortSelectTimers[i];

            start = System.currentTimeMillis();
            myArrayList2.insertionSort(Integer::compareTo);
            end = System.currentTimeMillis();
            sortInsertionTimers[i] = end - start;
            sortInsertionTotalTimers += sortInsertionTimers[i];

        }

        System.out.println("|  # |  select | insertion |");
        System.out.println("____________________________");

        for (int i = 0; i < M; i++) {
            System.out.printf("|%4d|%9.2f|%11.2f|%n", i + 1, sortSelectTimers[i] / 1000.0, sortInsertionTimers[i] / 1000.0);
        }
        System.out.printf("|avg|%9.2f|%11.2f|%n", sortSelectTotalTimers / 1000.0 / M, sortInsertionTotalTimers / 1000.0 / M);

    }

    public static void randomListFill(MyArrayList<Integer> myArrayList, int count, int a, int b) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            myArrayList.add(random.nextInt(b - a + 1) + a);

        }
    }

    public static void sortListPartialFill(MyArrayList<Integer> myArrayList, int count, int a, int b) {
        for (int i = 0; i < count - 25; i++) {
            myArrayList.add(i);
        }
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            myArrayList.add(random.nextInt(b - a + 1) + a);

        }
    }


}
