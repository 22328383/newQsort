import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class betterSortTest {

    @Test
    public void manualSortTest() {
        int[] array1 = {3, 1, 2};
        int[] expected1 = {1, 2, 3};

        betterSort.betterQuickSort(array1, 0, 2);
        assertArrayEquals(expected1, array1);
    }

    @Test
    public void calcPivotTest() {
        int[] array1 = {88,77,66,55,44,33,22,11};
        int[] array2 = {11,22,33,44,55,66,77,88};
        int[] array3 = {66,55,44,33,77,88};

        int[] input1 = new int[25];
        for(int i = 25; i > 1; i--) {
            input1[25-i] = (i*11);
        }

        assertEquals(49.5, betterSort.calcPivot(array1, 0, array1.length-1), 0.15);

        assertEquals(49.5, betterSort.calcPivot(array2, 0, array2.length-1), 0.15);

        assertEquals(60.5, betterSort.calcPivot(array3, 0, array3.length-1), 0.15);

        assertEquals(142.5, betterSort.calcPivot(input1, 0, input1.length-1), 0.15);
    }

    @Test
    public void betterQuickSortTest() {
        int[] array1 = {121,110,99,88,77,66,55,44,33,22,11};
        int[] array2 = {11,22,33,44,55,66,77,88,99,110,121};

        assertArrayEquals(array2, betterSort.betterQuickSort(array1, 0, array1.length-1));
        System.out.println(Arrays.toString(betterSort.betterQuickSort(array1, 0, array1.length - 1)));
    }

    @Test
    public void speedTest25() {
        int[] input1 = new int[25];
        for(int i = 25; i > 1; i--) {
            input1[25-i] = (i*11);
        }

        long startTime = System.nanoTime();
        betterSort.betterQuickSort(input1, 0, input1.length-1);
        long endTime = System.nanoTime();
        long elapsedTime = (endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    }

    @Test
    public void speedTest50() {
        int[] input1 = new int[50];
        for(int i = 50; i > 1; i--) {
            input1[50-i] = (i*11);
        }

        long startTime = System.nanoTime();
        betterSort.betterQuickSort(input1, 0, input1.length-1);
        long endTime = System.nanoTime();
        long elapsedTime = (endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    }

    @Test
    public void speedTest100() {
        int[] input1 = new int[100];
        for(int i = 100; i > 1; i--) {
            input1[100-i] = (i*11);
        }

        long startTime = System.nanoTime();
        betterSort.betterQuickSort(input1, 0, input1.length-1);
        long endTime = System.nanoTime();
        long elapsedTime = (endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    }
}