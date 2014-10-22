package ru.nevars;

public class MergeSort {

    public void sort(int array[]) {
        aux = new int[array.length];
        sort(array, 0, array.length - 1);
    }

    private void sort(int array[], int l, int r) {
        if (r <= l) {
            return;
        }
        int middle = l + (r - l) / 2;
        sort(array, l, middle);
        sort(array, middle + 1, r);
        m(array, l, middle, r);
    }

    private void merge(int array[], int l, int m, int r) {
        int i = l;
        int j = m + 1;
        for (int k = l; k <= r; k++) {
            aux[k] = array[k];
        }
        for (int k = l; k <= r; k++) {
            if (i > m)
                array[k] = aux[j++];
            else if (j > r)
                array[k] = aux[i++];
            else if (aux[j] > aux[i])
                array[k] = aux[j++];
            else
                array[k] = array[i++];
        }
    }

    public void m(int array[], int low, int middle, int high) {
        aux = new int[array.length];
        int i = low;
        int j = middle + 1;
        for (int k = low; k <= high; k++) {
            aux[k] = array[k];
        }
        for (int k = low; k <= high; k++) {
            if (i > middle)
                array[k] = aux[j++];
            else if (j > high)
                array[k] = aux[i++];
            else if (aux[j] < aux[i])
                array[k] = aux[j++];
            else array[k] = array[i++];
        }
    }

    private static int aux[];
}
