import java.util.Arrays;

public class betterSort {

    public static int[] betterQuickSort(int[] array, int low, int high) {
        int N = high - low + 1;
        if(N <= 3) {
            return manSort(array, low, high);
        } else {
            double pivot = calcPivot(array, low, high);
            int q     = partition(array, low, high, pivot);
            betterQuickSort(array, low, q);
            betterQuickSort(array, q+1, high);
        }
        return array;
    }

    private static int partition(int[] array, int low, int high, double pivot) {
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            if (i < j) {
                swap(array, i, j);
            } else {
                return j;
            }
        }
    }

    public static double calcPivot(int[] array, int low, int high) {
//        double piv;
//
//        int mid = ((low + high)/2);
//        int min1 = findMin(array, low, mid);
//        int min2 = findMin(array, mid + 1, high);
//        int max1 = findMax(array, low, mid);
//        int max2 = findMax(array, mid + 1, high);
//
//        piv = ((double)((max1 + min1) / (double)(mid - low + 1) + (max2 + min2) / (double)(high - mid))) / 2;
//
//
//        ^^^ this may lead to a pivot smaller than all elements => infinite loop of partitioning
//        (Example : [88 77 66 55 44 99 110 121], ( (88+55)/4 + (121+44)/4) )/2 = 38.5)

        int sum = 0;
        for(int i = low; i <= high; i++) {
            sum = sum + array[i];
        }

        double piv = (double) sum / (high-low+1);
        return piv;
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
        for(int i = low; i <= high; i++) {
            int current = array[i];
            if(current < min) {
                min = current;
            }
        }
        return min;
    }

    private static int findMax(int[] array, int low, int high) {
        int max = array[low];
        for(int i = low; i <= high; i++) {
            int current = array[i];
            if(current > max) {
                max = current;
            }
        }
        return max;
    }
}
