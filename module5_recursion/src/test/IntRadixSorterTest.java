package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.IntRadixSorter;

public class IntRadixSorterTest {
    // Tests for getDigits method
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
    public void testZeroGetMaxDigits() { 
        int[] testArray = {0, 1, 55, 999};
        assertEquals(3, IntRadixSorter.getMaxDigits(testArray));
    }

    @Test
    public void testIntRadixSort() {
        int[] inArray = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
        int[] sortedArray = {94, 99, 182, 264, 295, 356, 472, 491, 543, 692, 783};
        assertArrayEquals(sortedArray, IntRadixSorter.intRadixSort(inArray));
    }
}
