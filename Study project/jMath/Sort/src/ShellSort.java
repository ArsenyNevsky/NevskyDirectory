/**
 * Created with IntelliJ IDEA 12.
 * All rights reserved. email: erafiil@gmail.com
 * User: ${Arseny_Nevsky}
 * Date: 09.11.13
 * Time: 19:54
 * Location: ${Russia_Saint-Petersburg}
 */
public class ShellSort <T extends Comparable<T>> {

    public ShellSort(T[] array) {
        this.array = array;
    }


    public ShellSort() {
        array = null;
    }

    public void sort() {

    }


    public void sort(T[] array) {
        this.array = array;
    }

    public void print() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private T[] array;
}
