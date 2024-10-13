package test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import main.IntRadixSorter;

public class IntRadixSorterTest {
    // Tests for getDigits method
    @Test
    public void testNegativeGetDigits() { assertThrows(IllegalArgumentException.class, () -> {IntRadixSorter.getDigits(-5);}); }

    @Test
    public void testZeroGetDigits() { assertEquals(1, IntRadixSorter.getDigits(0)); }

    @Test
    public void testOneGetDigits() { assertEquals(1, IntRadixSorter.getDigits(1)); }

    @Test
    public void testNineGetDigits() { assertEquals(1, IntRadixSorter.getDigits(9)); }

    @Test
    public void testTenGetDigits() { assertEquals(2, IntRadixSorter.getDigits(10)); }

    @Test
    public void test99GetDigits() { assertEquals(2, IntRadixSorter.getDigits(99)); }

    @Test
    public void test100GetDigits() { assertEquals(3, IntRadixSorter.getDigits(100)); }

    @Test
    public void test999GetDigits() { assertEquals(3, IntRadixSorter.getDigits(999)); }

    // Tests for getMaxDigits method
    @Test
    public void testNegativeGetMaxDigits() { 
        int[] testArray = {1, 2, 3, -5};
        assertThrows(IllegalArgumentException.class, () -> {IntRadixSorter.getMaxDigits(testArray);}); }

    @Test
    public void testZeroGetMaxDigits() { 
        int[] testArray = {0, 0, 0, 0};
        assertEquals(1, IntRadixSorter.getMaxDigits(testArray));
    }

    @Test
    public void testRangeGetMaxDigits() { 
        int[] testArray = {0, 1, 55, 999};
        assertEquals(3, IntRadixSorter.getMaxDigits(testArray));
    }

    // Tests for intRadixSort method
    @Test
    public void testNegativeIntRadixSort() { 
        int[] testArray = {1, 2, 3, -5};
        assertThrows(IllegalArgumentException.class, () -> {IntRadixSorter.intRadixSort(testArray);}); }

    @Test
    public void testEmptyIntRadixSort() {
        int[] inArray = new int[5];
        int[] sortedArray = {0, 0, 0, 0, 0};
        assertArrayEquals(sortedArray, IntRadixSorter.intRadixSort(inArray));
    }

    @Test
    public void testIntRadixSort() {
        int[] inArray = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
        int[] sortedArray = {94, 99, 182, 264, 295, 356, 472, 491, 543, 692, 783};
        assertArrayEquals(sortedArray, IntRadixSorter.intRadixSort(inArray));
    }
}
