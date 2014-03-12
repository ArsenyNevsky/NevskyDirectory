public class InsertSort<T extends Comparable<T>> extends AbstractSort<T> {

    public InsertSort(T[] array) {
        this.array = array;
        size = array.length;
    }

    @Override
    public void sort() {
        sort(array);
    }

    private void sort(T[] array) {
        for (int i = 1; i < size; i++) {
            int j = i - 1;
            T temp = array[i];
            while (j >= 0 && array[j].compareTo(temp) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public T[] getArray() {
        return array;
    }
}
