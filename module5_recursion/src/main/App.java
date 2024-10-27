package main;
public class App {
    public static void main(String[] args) {
        
        try {
            // int[] testArray = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
            int[] testArray = null;
            IntRadixSorter.intRadixSort(testArray);    
        } 
        catch (NullPointerException e) {
            System.err.println(e.getMessage());
            System.out.println("Please instantiate input array with at least one integer.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.out.println("Please instantiate input array with at least one integer.");
        }

        
        
    }
}
