import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 09.10.13
 * Time: 11:59
 * Location: ${Russia_Saint-Petersburg}
 */
public class BubbleSort<T extends Comparable<T>> {


    public BubbleSort(T[] array) {
        this.array = array;
        SIZE_ARRAY = array.length;
    }


    public void sort() {
        for (int i = 0; i < SIZE_ARRAY; i++) {
            for (int j = 0; j < SIZE_ARRAY; j++) {
                if (array[i].compareTo(array[j])< 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public void print() {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


    private final int SIZE_ARRAY;
    private T[] array;
}
