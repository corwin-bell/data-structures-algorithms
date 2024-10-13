
public class BagApp {
    public static void main(String[] args) throws Exception {
        // Create an instance of the `Bag` class for String keys
        Bag<String> newBag = new Bag<>();
        
        // declare item variable for item tests
        String item = null; 
        newBag.add(item);
        newBag.remove(item);
        // Add several elements to the bag, including duplicates.
        String[] produceArray = {"Apple", "Apple", "Orange", "Banana"};
        for (String produce: produceArray) {
            newBag.add(produce);
        }
        // Print the bag contents.
        System.out.println("Bag contents: " + newBag.toString());
        
        // Test the `contains` method for a few elements.
        item = "Apple";
        System.out.printf("Does the bag contain %s?: %b \n", item, newBag.contains(item));
        item = "Eggs";
        System.out.printf("Does the bag contain %s?: %b \n", item, newBag.contains(item));

        // Test the `count` method for a few elements.
        item = "Apple";
        System.out.printf("The bag has %d %s\n", newBag.count(item), item);
        item = "Banana";
        System.out.printf("The bag has %d %s\n", newBag.count(item), item);

        // Remove an element from the bag.
        newBag.remove(item);

        // Print the bag contents again
        System.out.println("Bag contents: " + newBag.toString());

        // Test the `contains` method for the removed element.
        System.out.printf("Does the bag contain %s?: %b \n", item, newBag.contains(item));
        
        // Test the `count` method for the removed element.
        System.out.printf("Count of %s: %d\n", item, newBag.count(item));
    }
}
