import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class betterSortTest {

    @Test
    public void manualSort() {
        Integer[] array1 = {3, 1, 2};
        Integer[] expected1 = {1, 2, 3};

        Double[] array2 = {99.42, 5.69};
        Double[] expected2 = {5.69, 99.42};

        betterSort.betterQuickSort(array1, 0, 2);
        assertArrayEquals(expected1, array1);

        betterSort.betterQuickSort(array2, 0, 1);
        assertArrayEquals(expected2, array2);
    }
}