package main;
import java.util.Comparator;

public class QuickSorter {
    
    /** Recursive quicksort of an input array inplace.
     * @param inArray input array to be sorted
     * @param comp custom class comparator
     * @param first first index in range
     * @param last last index in range
     * @see Source: Goodrich, M. T., & Tamassia, R. (2008). Data Structures and Algorithms in Java, 3rd Ed. Wiley India Pvt. Limited.
     */
    public static <T> void quickSortInPlace(T[] inArray, Comparator<T> comp, int first, int last) {
        if (first >= last) return;                // subarray is trivially sorted
        T pivot = inArray[last];
        T temp;                            // temp object used for swapping
        int left = first;
        int right = last-1;
        while (left <= right) {
            // scan until reaching value equal or larger than pivot (or right marker)
            while (left <= right && comp.compare(inArray[left], pivot) < 0) left++;
            // scan until reaching value equal or smaller than pivot (or left marker)
            while (left <= right && comp.compare(inArray[right], pivot) > 0) right--;
            if (left <= right) {             // indices did not strictly cross
                // so swap values and shrink range
                temp = inArray[left]; inArray[left] = inArray[right]; inArray[right] = temp;
                left++; right--;
            }
        }
        // put pivot into its final place (currently marked by left index)
        temp = inArray[left]; inArray[left] = inArray[last]; inArray[last] = temp;
    
        // make recursive calls
        quickSortInPlace(inArray, comp, first, left - 1);
        quickSortInPlace(inArray, comp, left + 1, last);
    }
}

