/**
 * Created with IntelliJ IDEA 12.
 * All rights reserved. email: erafiil@gmail.com
 * User: ${Arseny_Nevsky}
 * Date: 25.10.13
 * Time: 1:05
 * Location: ${Russia_Saint-Petersburg}
 */
public abstract class AbstractSort<T extends Comparable<T>> {

    public abstract void sort() throws InterruptedException;

    public void print() {
        System.out.print("[Array]:\t");
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("[Array sorted]:\t" + isSorted());
    }

    protected void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private boolean isSorted() {
        for (int i = 1; i < array.length - 1; i++) {
            if (!(array[i - 1].compareTo(array[i]) < 0)) {
                return false;
            }
        }
        return true;
    }

    protected int size;

    volatile protected T array[];
}
