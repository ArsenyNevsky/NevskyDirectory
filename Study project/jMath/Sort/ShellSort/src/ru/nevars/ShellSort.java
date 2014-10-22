package ru.nevars;

public class ShellSort {

    public void sort(int array[]) {
        int step = array.length / 2;
        while (step > 0) {
            for (int i = 0; i < array.length - step; i++) {
                for (int j = i; (j >= 0) && array[j] > array[j + step]; j -= step) {
                    int t = array[j];
                    array[j] = array[j + step];
                    array[j + step] = t;
                }
            }
            step /= 2;
        }
    }
}
