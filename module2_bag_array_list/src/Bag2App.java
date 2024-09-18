public class Bag2App {
    public static void main(String[] args) throws Exception {
        // TODO: implement the following
        // Create two instances of the `Bag` class.
        Bag<String> newBag1 = new Bag<>();
        newBag1.add("Apple");
        newBag1.add("Apple");
        newBag1.add("Plum");
        
        System.out.println("Number of items in bag: " + newBag1.getSize());

        Bag<String> newBag2 = new Bag<>();
        newBag2.add("Apple");
        newBag2.add("Eggs");
        newBag2.add("Flour");

        System.out.println("Bag 1: " + newBag1.toString());
        System.out.println("Bag 2: " + newBag2.toString());
        
        newBag1.merge(newBag2);
        System.out.println("Bag1 after merge: " + newBag1.toString());
        
        // Add elements to each bag, including duplicates.
        // Print the size of each bag using the `size` method.
        // Merge the two bags together using the `merge` method.
        // Print the merged bag contents.
        // Create a new bag containing only the distinct elements using the `distinct` method.
        // Print the distinct bag contents.
    }
}
