/**
 * Created with IntelliJ IDEA 12.
 * All rights reserved. email: erafiil@gmail.com
 * User: ${Arseny_Nevsky}
 * Date: 25.10.13
 * Time: 1:04
 * Location: ${Russia_Saint-Petersburg}
 */
public class InsertSort <T extends Comparable<T>> {


    public InsertSort() {

    }


    public void sort(T[] arr) {
        this.array = arr;
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            T temp = array[i];
            while (j >= 0 && array[j].compareTo(temp) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }


    public void print() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public T[] getArray() {
        return array;
    }

    private T[] array;
}
