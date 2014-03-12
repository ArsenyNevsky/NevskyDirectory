public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*
        System.out.println("SIMPLE QUICKSORT:");
        Integer[] array_0 = {2, 9, 1, 0, 3, 7, 4, 6, 5, 8, 10, 17, 12, 14, 16, 15, 11, 13, 19, 18, 20};
        ContextSort csort = new ContextSort(new QuickSort(array_0));
        csort.sort();
        csort.print();


        System.out.println("\nSIMPLE BUBBLESORT:");
        Integer[] array_2 = {2, 9, 1, 0, 3, 7, 4, 6, 5, 8, 10, 17, 12, 14, 16, 15, 11, 13, 19, 18, 20};
        csort.setSortStrategy(new BubbleSort(array_2));
        csort.sort();
        csort.print();

        System.out.println("\nSIMPLE MERGESORT:");
        Integer[] array_3 = {2, 9, 1, 0, 3, 7, 4, 6, 5, 8, 10, 17, 12, 14, 16, 15, 11, 13, 19, 18, 20};
        csort.setSortStrategy(new BubbleSort(array_3));
        csort.sort();
        csort.print();

        csort.executeMergeSort(); // Parallel MergeSort

        int[] array_4 = {2, 9, 1, 0, 3, 7, 4, 6, 5, 8, 10, 17, 12, 14, 16, 15, 11, 13, 19, 18, 20};
        QuickSortParallel q = new QuickSortParallel(0, array_4, 0, array_4.length - 1);
        long start = System.nanoTime();
        q.run();
        long result = System.nanoTime();
        System.out.println("Parallel quicksort:\n" + (result - start) / 1000);
        System.out.println("\n\n\n Processors: " + Runtime.getRuntime().availableProcessors());
        */

        int array[] = {2, 9, 1, 0, 3, 7, 4, 6, 5, 8, 10, 17, 12, 14, 16, 15, 11, 13, 19, 18, 20};
        QuickSortParallel q = new QuickSortParallel(array, 0, array.length - 1);

        long startTime = System.nanoTime();
        q.execute(array, 0, array.length - 1);
        System.out.println("Time is:\t" + (System.nanoTime() - startTime) / 100000);
    }
}
