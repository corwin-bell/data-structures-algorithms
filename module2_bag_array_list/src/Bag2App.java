public class Bag2App {
    public static void main(String[] args) throws Exception {
        // Create two instances of the `Bag` class.
        Bag<String> newBag1 = new Bag<>();
        Bag<String> newBag2 = new Bag<>();
        
        // Add elements to each bag, including duplicates.
        newBag1.add("Apple");
        newBag1.add("Apple");
        newBag1.add("Plum");
        System.out.println("Bag 1: " + newBag1.toString());
        newBag2.add("Apple");
        newBag2.add("Plum");
        newBag2.add("Flour");
        System.out.println("Bag 2: " + newBag2.toString());
        
        // Print the size of each bag using the `size` method.    
        System.out.println("Number of items in Bag 1: " + newBag1.getSize());
        System.out.println("Number of items in Bag 2: " + newBag2.getSize());
        
        // Merge the two bags together using the `merge` method.
        newBag1.merge(newBag2);
        // Print the merged bag contents.
        System.out.println("Bag1 after merge: " + newBag1.toString());
        
        // Create a new bag containing only the distinct elements using the `distinct` method.
        Bag<String> distinctBag = newBag1.distinct();
        // Print the distinct bag contents.
        System.out.println("Distinct contents of merged Bag 1: " + distinctBag.toString());
    }
}
