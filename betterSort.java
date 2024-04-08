public class betterSort {

    public static <E extends Comparable<E>> E[] betterQuickSort(E[] array, int low, int high) {
        int N = high - low + 1;
        if(N <= 3) {
            return manSort(array, low, high);
        } else {
            int pivot = calcPivot(array, low, high);
            int q     = partition(array, low, high, pivot);
            betterQuickSort(array, low, q);
            betterQuickSort(array, q+1, high);
        }
        return array;
    }

    private static <E extends Comparable<E>> int partition(E[] array, int low, int high, int pivot) {
        // TODO
        return 0;
    }

    private static <E extends Comparable<E>> int calcPivot(E[] array, int low, int high) {
        // TODO
        return 0;
    }

    private static <E extends Comparable<E>> E[] manSort(E[] array, int low, int high) {
        int N = high - low + 1;
        if(N <= 1) {
            return array;
        }
        if(N == 2) {
            if((array[low].compareTo(array[high])) > 0) {
                swap(array, low, high);
            }
        }
        if(N == 3) {
            if((array[low].compareTo(array[high-1])) > 0) {
                swap(array, low, high-1);
            }
        }

        if((array[low].compareTo(array[high])) > 0) {
            swap(array, low, high);
        }
        if((array[high-1].compareTo(array[high])) > 0) {
            swap(array, high-1, high);
        }
        return array;
    }

    private static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
