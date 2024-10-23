import java.util.Arrays;
import java.util.Comparator;

public class App {
    
    public static void main(String[] args) throws Exception {
        Integer[] inArray = {5,2,4,1,7,3};
        // override compare method with lamda expression
        Comparator<Integer> intComparator = (a, b) -> a - b;
        MergeSort.mergeSort(inArray, intComparator);
        System.out.println(Arrays.toString(inArray));
    }
}
