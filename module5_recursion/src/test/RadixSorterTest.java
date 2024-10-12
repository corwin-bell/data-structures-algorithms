package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.RadixSorter;

public class RadixSorterTest {
    // Tests for getDigits method
    @Test
    public void testZeroGetDigits() {
        assertEquals(1, RadixSorter.getDigits(0));
    }

    @Test
    public void testOneGetDigits() {
        assertEquals(1, RadixSorter.getDigits(1));
    }

    @Test
    public void testNineGetDigits() {
        assertEquals(1, RadixSorter.getDigits(9));
    }

    @Test
    public void testTenGetDigits() {
        assertEquals(2, RadixSorter.getDigits(10));
    }

    @Test
    public void test99GetDigits() {
        assertEquals(2, RadixSorter.getDigits(99));
    }

    @Test
    public void test100GetDigits() {
        assertEquals(3, RadixSorter.getDigits(100));
    }

    @Test
    public void test999GetDigits() {
        assertEquals(3, RadixSorter.getDigits(999));
    }
}
