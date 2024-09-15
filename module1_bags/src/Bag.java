import java.util.HashMap;

// A Bag implementation that handles generic types and stores duplicates as an integer count
public class Bag<T> {
    // fields
    // hashmap to store items as keys, and count as value
    private HashMap<T, Integer> bagMap;
    
    // default constructor
    Bag(){
        this.bagMap = new HashMap<>(); 
    }
    
    // Methods
    // add an item of type T to the bag.
    public void add(T item) {
        if (this.bagMap.containsKey(item)) { 
            Integer value = this.bagMap.get(item);
            this.bagMap.replace(item, value + 1);
        }
        else {
            this.bagMap.put(item, 1);
        }
    }
    
    // remove one occurrence of the item from the bag, if it exists.
    public void remove(T item) {
        if (this.bagMap.containsKey(item)) {
            Integer value = this.bagMap.get(item);
            if (value > 1) {
                this.bagMap.replace(item, value - 1);
            }
            else if (value == 1) {
                this.bagMap.remove(item);
            }
        }
        else {
            System.out.printf("there is no %s in the bag\n", item);
        }
    }
    
    // return true if the item exists in the bag; otherwise, it should return false.
    public boolean contains(T item) {
        return this.bagMap.containsKey(item);
    }
    
    // return count if exists, null if not.
    public Integer count(T item) {
        if (this.bagMap.containsKey(item)) {
            return this.bagMap.get(item);
        }
        else {
            return null;
        }
    }

    @Override
    public String toString() {
        return this.bagMap.toString();
    }
}