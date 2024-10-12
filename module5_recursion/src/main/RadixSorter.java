package main;

public class RadixSorter {
    
    // methods
    // radixSort (int[] intArray)
        // bucket array of arraylist<int> size 10 to store integers by digit
        // getMaxDigits
        // for each digit index
            // for each int in intArray
                // place int in bucket matching value
            // for each bucket
                // for each int in bucket
                    // put ints back in array
            // iterate digit index
            // clear buckets
        
    // getMaxDigits (input array)
        // loop of getDigits
    // getDigits (Integer)
    public static int getDigits(int Number) {
        if (Number == 0) { return 1; }
        return (int) Math.log10(Number) + 1;
        
    }
        // find number of digits of input integer
    public static void main(String[] args) {
        
    }

}
