public class QuickSort<T extends Comparable<T>> extends AbstractSort<T> {

    public QuickSort(T[] array) {
        this.array = array;
        size = array.length;
    }

    public void quickSort() {
        quickSort(0, size - 1);
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;
        T middle = array[(low + high) / 2];
        do {
            while(array[i].compareTo(middle) < 0) ++i;
            while(array[j].compareTo(middle) > 0) --j;
            if (i <= j) {
                swap(i, j);
                i++ ; j--;
            }
        } while(i <= j);
        if (low < j) quickSort(low, j);
        if (i < high) quickSort(i, high);
    }

    private void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
