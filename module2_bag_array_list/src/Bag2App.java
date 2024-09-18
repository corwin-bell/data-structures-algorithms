public class Bag2App {
    public static void main(String[] args) throws Exception {
        // TODO: implement the following
        // Create two instances of the `Bag` class.
        Bag2<String> newBag1 = new Bag2<>();
        newBag1.add("Apple");
        newBag1.add("Apple");
        newBag1.add("Plum");

        System.out.println("Number of items in bag: " + newBag1.getSize());
        // Add elements to each bag, including duplicates.
        // Print the size of each bag using the `size` method.
        // Merge the two bags together using the `merge` method.
        // Print the merged bag contents.
        // Create a new bag containing only the distinct elements using the `distinct` method.
        // Print the distinct bag contents.
    }
}
