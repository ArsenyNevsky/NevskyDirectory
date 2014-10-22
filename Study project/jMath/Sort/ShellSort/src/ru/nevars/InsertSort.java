package ru.nevars;

public class InsertSort {

    public void sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int key = array[i];
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[++j] = key;
        }
    }
}
