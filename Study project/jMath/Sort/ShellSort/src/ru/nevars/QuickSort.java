package ru.nevars;

public class QuickSort {

    public void sort(int array[]) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int array[], int m, int n) {
        int low = m;
        int high = n;
        int middle = array[low + (high - low) / 2];
        int i = low;
        int j = high;
        while (i < j) {
            while (array[i] < middle)
                i++;
            while (array[j] > middle)
                j--;
            if (i < j) {
                swap(array, i, j);
            }
            i++;
            j--;
        }
        if (low < j)
            sort(array, low, j);
        if (i < high)
            sort(array, i, high);
    }


    private void swap(int array[], int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
