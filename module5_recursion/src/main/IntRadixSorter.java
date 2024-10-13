package main;

import java.util.ArrayList;
import java.util.Arrays;

public class IntRadixSorter {
    
    // methods
    // radixSort (int[] intArray)
    public static int[] intRadixSort(int[] intArray) {
        // bucket array of arraylist<int> size 10 to store integers by digit
        // I'm ok with supressing this warning since this method is designed to only work
        // with positive integers, making the use of an array of lists preferable to other structures
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] bucketArray = new ArrayList[10];
        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new ArrayList<Integer>();
        }
        // getMaxDigits
        int maxDigits = getMaxDigits(intArray);
        System.out.println("max digits: " + maxDigits);
        int currPow = 10;
        System.out.println("current power: " + currPow);
        // for each digit index
        for (int i = 0; i < maxDigits; i++) {
            System.out.println("current digit: " + i);
            // for each int in intArray
            for (int j = 0; j < intArray.length; j++) {
                System.out.println("in number: " + intArray[j]);
                // place int in bucket matching value
                int digitValue = (intArray[j] % currPow) / (currPow / 10);
                System.out.println("digit value: " + digitValue);
                bucketArray[digitValue].add(intArray[j]);
            }
            // for each bucket
            int index = 0;
            for (int k = 0; k < bucketArray.length; k++) {
                // for each int in bucket
                for (int l = 0; l < bucketArray[k].size(); l++) {
                    // put ints back in array
                    int sortedVal = bucketArray[k].get(l);
                    System.out.println("sorted value: " + sortedVal);
                    intArray[index] = sortedVal;
                    index++;
                }
            }
            System.out.println("sorted array for digit: " + Arrays.toString(intArray));
            currPow *= 10;
            // clear buckets
            for (int m = 0; m < bucketArray.length; m++) {
                bucketArray[m].clear();
            }
        }
        return intArray;
    }
        
    // getMaxDigits (input array)
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
        // loop of getDigits
    // getDigits (Integer)
    public static int getDigits(int Number) {
        if (Number == 0) { return 1; }
        return (int) Math.log10(Number) + 1;
        
    }
        // find number of digits of input integer
    public static void main(String[] args) {
        int[] testArray = {987, 123, 100, 98, 56, 12, 10, 9, 1, 0};
        intRadixSort(testArray);
    }

}
