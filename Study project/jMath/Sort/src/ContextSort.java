public class ContextSort {

    public ContextSort(AbstractSort sort) {
        this.sort = sort;
        cm = new ContextMerge();
    }

    public void sort() throws InterruptedException {
        startTime = System.nanoTime();
        sort.sort();
        resultTime = System.nanoTime() - startTime;
    }

    public void setSortStrategy(AbstractSort sort) {
        this.sort = sort;
    }

    public void print() {
        sort.print();
        System.out.println("[Time is]:\t" + (resultTime / 1000) + "\n");
        System.out.println("--------------------------------------------------");
    }

    public long getResultTime() {
        return resultTime;
    }

    public void executeMergeSort() {
        cm.go();
        System.out.println("PARALLEL MERGESORT:");
        System.out.println("[Time is]:\t" + cm.getResultTime() + "\n");
        System.out.println("--------------------------------------------------");
    }

    private AbstractSort sort;
    private ContextMerge cm;
    private long startTime;
    private long resultTime;
}
