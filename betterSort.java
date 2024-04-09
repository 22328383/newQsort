public class betterSort {

    public static int[] betterQuickSort(int[] array, int low, int high) {
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

    private static int partition(int[] array, int low, int high, int pivot) {
        // TODO
        return 0;
    }

    public static int calcPivot(int[] array, int low, int high) {
        int mid = ((low + high)/2);
        int min1 = findMin(array, low, mid);
        int min2 = findMin(array, mid, high);
        int max1 = findMax(array, low, mid);
        int max2 = findMax(array, mid, high);

        int result = (min1 + min2 + max1 + max2) >> 3;
        return result;
    }

    private static int[] manSort(int[] array, int low, int high) {
        int N = high - low + 1;
        if(N <= 1) {
            return array;
        }
        if(N == 2) {
            if(array[low] > array[high]) {
                swap(array, low, high);
            }
        }
        if(N == 3) {
            if(array[low] > array[high-1]) {
                swap(array, low, high-1);
            }
        }

        if(array[low] > array[high]) {
            swap(array, low, high);
        }
        if(array[high-1] > array[high]) {
            swap(array, high-1, high);
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int findMin(int[] array, int low, int high) {
        int min = array[low];
        for(int i = low; i < high; i++) {
            int current = array[i];
            if(current < min) {
                min = current;
            }
        }
        return min;
    }

    private static int findMax(int[] array, int low, int high) {
        int max = array[low];
        for(int i = low; i < high; i++) {
            int current = array[i];
            if(current > max) {
                max = current;
            }
        }
        return max;
    }
}
