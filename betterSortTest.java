import org.junit.Test;

import static org.junit.Assert.*;

public class betterSortTest {

    @Test
    public void manualSort() {
        int[] array1 = {3, 1, 2};
        int[] expected1 = {1, 2, 3};

        betterSort.betterQuickSort(array1, 0, 2);
        assertArrayEquals(expected1, array1);

    }

    @Test
    public void calcPivot() {
        int[] array1 = {88,77,66,55,44,33,22,11};

        assertEquals(24, betterSort.calcPivot(array1, 0, array1.length));
    }
}