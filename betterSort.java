public class betterSort {

    public static <E extends Comparable<E>> E[] betterQuickSort(E[] array, int high, int low) {
        int N = high - low + 1;
        if(N <= 3) {
            return manSort(array, high, low);
        } else {
            int pivot = calcPivot(array, high, low);
            int q     = partition(array, high, low, pivot);
            betterQuickSort(array, q, low);
            betterQuickSort(array, high, q+1);
        }
        return array;
    }

    private static <E extends Comparable<E>> int partition(E[] array, int high, int low, int pivot) {
        // TODO
        return 0;
    }

    private static <E extends Comparable<E>> int calcPivot(E[] array, int high, int low) {
        // TODO
        return 0;
    }

    private static <E extends Comparable<E>> E[] manSort(E[] array, int high, int low) {
        // TODO
        return null;
    }
}
