import java.util.HashMap;

public class Bag<K> {
    // fields
    // hashmap to store items as keys, and count as value
    private HashMap<K, Integer> bagMap;
    // default constructor
    Bag(){
        this.bagMap = new HashMap<>(); 
    }
    // Methods
    // void add(T item)`: This method should add an item of type T to the bag.
    public void add(K item) {
        // if item in bag, increment count
        //  else, add to bag
        if (this.bagMap.containsKey(item)) { 
            Integer value = this.bagMap.get(item);
            this.bagMap.replace(item, value + 1);
        }
        else {
            this.bagMap.put(item, 1);
        }
    }
    // void remove(T item)`: This method should remove one occurrence of the item from the bag, if it exists.
    public void remove(K item) {
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
    // - `boolean contains(T item)`: This method should return true if the item exists in the bag; otherwise, it should return false.
    public boolean contains(K item) {
        return this.bagMap.containsKey(item);
    }
    // - `int count(T item)`: Return count if exists, null if not.
    public Integer count(K item) {
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