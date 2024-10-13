package main;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Contains method to sort arrays of unsigned integers using radix sort. 
 */
public class IntRadixSorter {
    
    /**
     * Method to sort an array of unsigned integers using radix sort. 
     * @param intArray
     * @return int[]
     */
    public static int[] intRadixSort(int[] intArray) {
        
        System.out.println("input array: " + Arrays.toString(intArray));
        int maxDigits = getMaxDigits(intArray);
        System.out.println("max digits: " + maxDigits);
        int currPow = 10;
        // create bucket array, array of arraylist to store int values sorted by digit
        @SuppressWarnings("unchecked") // since I know the array only needs 10 buckets 
        ArrayList<Integer>[] bucketArray = new ArrayList[10];
        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < maxDigits; i++) {
            System.out.println("current digit: " + (i + 1));
            for (int j = 0; j < intArray.length; j++) {
                System.out.print(intArray[j]);
                // place int in bucket based on digit value
                int digitValue = (intArray[j] % currPow) / (currPow / 10);
                System.out.println(", digit value: " + digitValue);
                bucketArray[digitValue].add(intArray[j]);
            }
            int index = 0;
            for (int k = 0; k < bucketArray.length; k++) {
                for (int l = 0; l < bucketArray[k].size(); l++) {
                    int sortedVal = bucketArray[k].get(l);
                    intArray[index] = sortedVal;
                    index++;
                }
            }
            System.out.println("sorted array for digit " + (i + 1) + ": " + Arrays.toString(intArray) + "\n");
            currPow *= 10;
            for (int m = 0; m < bucketArray.length; m++) {
                bucketArray[m].clear();
            }
        }
        return intArray;
    }
        
    /**
     * Returns the maximum number of digits for an array of positive integers. 
     * @param intArray
     * @return int
     */
    public static int getMaxDigits(int[] intArray) {
        int maxDigits = getDigits(intArray[0]);
        int numberDigits;
        for (int i = 1; i < intArray.length; i++) {
            numberDigits = getDigits(intArray[i]);
            if (numberDigits > maxDigits) {
                maxDigits = numberDigits;
            }
        }
        return maxDigits;
    }
    
    /** 
     * Returns the number of digits for a positive integer.
     * @param Number
     * @return int
     * @exception IllegalArgumentException if input integer is negative
     */
    public static int getDigits(int Number) {
        if (Number < 0) {
            throw new IllegalArgumentException("negative integer " + Number + " not allowed, must be positive");
        }
        if (Number == 0) { return 1; }
        return (int) Math.log10(Number) + 1;
    }
}
