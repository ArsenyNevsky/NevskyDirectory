public class BubbleSort<T extends Comparable<T>> extends AbstractSort<T> {

    public BubbleSort(T[] array) {
        this.array = array;
        size = array.length;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i].compareTo(array[j]) < 0) {
                    swap(i, j);
                }
            }
        }
    }
}
