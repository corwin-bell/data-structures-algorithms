import java.util.HashSet;
import java.util.Set;

public class App {
    
    /** Finds the missing value in series of integers that has all but one value.
     * @param inArray
     * @return Set<Integer>
     */
    public static Set<Integer> missingValFinder(int[] inArray) {
        
         Set<Integer> inSet = new HashSet<>(); // 1 computations
         for(int val: inArray) { // 1 computation
            inSet.add(val); // add array values to hashset (n computations)
         }
         System.out.println("input set: " + inSet);
        // create hashset with values in same range as array
        Set<Integer> compareSet = new HashSet<>(); // 1 computation
        for (int i = 1; i < inArray.length + 2; i++) { // 1 computation
            compareSet.add(i); // n * 3 computations
        }
        System.out.println("compare set: " + compareSet);
        compareSet.removeAll(inSet); // calculate set difference (n computations)
        return compareSet;
    }
    public static void main(String[] args) throws Exception {
        // input array of len n with random selected values in range (1:n+1)
        int[] testArray = {4,3,6,1,5};
        System.out.println("Missing value in Array: " + missingValFinder(testArray));

    }
}
