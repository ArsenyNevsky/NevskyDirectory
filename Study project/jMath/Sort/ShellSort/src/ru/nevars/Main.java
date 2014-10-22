package ru.nevars;

import java.util.Arrays;

public class Main {

    public static void lis(int array[]) {
        int N = array.length;
        String p[] = new String[N];
        int size[] = new int[N];
        Arrays.fill(size, 1);

        for (int i = 0; i < N; i++) {
            p[i] = array[i] + " ";
        }
        int maxLength = 1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && size[i] < size[j] + 1) {
                    size[i] = size[j] + 1;
                    p[i] = p[j] + array[i] + " ";
                }
                if (maxLength < size[i]) {
                    maxLength = size[i];
                }
            }
        }
        System.out.println("maxLength = " + maxLength);
        for (int i = 0; i < N; i++) {
            if (maxLength != 0) {
                System.out.println("Seq: " + p[i]);
            }
        }
    }

    public static void gg(int n) {
        double ai[] = new double[n];
        double xn[] = new double[n];

        double x = Math.sqrt(2);
        double a0 = Math.floor(x);
        double x0 = x - a0;

        ai[0] = Math.floor(1. / x0);
        xn[0] = ((1. / x0)  - ai[0]);

        for (int i = 1; i < n; i++) {
            ai[i] = Math.floor(1. / xn[i - 1]);
            xn[i] = ((1. / xn[i - 1])   - ai[i]);
        }
        System.out.print(a0 + " ");
        for (int i = 0; i < n; i++) {
            System.out.print(ai[i] + " ");
        }
    }
    // 1.414213562373095048801688724209698078569671875376948073176679...

    public static void main(String[] args) {
        // 5 2 8 6 3 6 9 7
        //int array[] = {5, 2, 8, 6, 3, 6, 9, 7};
        int array[] = {2, 6, 4, 5, 1, 3};
        //lis(array);
        System.out.println((0.414213 * 10) / 10);
    }
}