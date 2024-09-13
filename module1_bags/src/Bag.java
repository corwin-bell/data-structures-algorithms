// Design a Java class called `Bag` that implements the bag data structure.

import java.util.HashMap;

public class Bag {
    // fields
    // hashmap to store items as keys, and count as value
    private HashMap<String, Integer> bagMap;
    // default constructor
    Bag(){
        this.bagMap = new HashMap<>(); 
    }
    // Methods
    // void add(T item)`: This method should add an item of type T to the bag.
    // void remove(T item)`: This method should remove one occurrence of the item from the bag, if it exists.
    // - `boolean contains(T item)`: This method should return true if the item exists in the bag; otherwise, it should return false.
    // - `int count(T item)`: Return count if exists, null if not.
}