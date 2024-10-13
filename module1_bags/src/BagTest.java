import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BagTest {
    @Test
    void testAdd() {
        Bag<String> newBag = new Bag<>();
        String item = "Apple";
        newBag.add(item);
        assertEquals(true, newBag.contains(item));
    }

    @Test
    void testTrueContains() {
        Bag<String> newBag = new Bag<>();
        String item = "Apple";
        newBag.add(item);
        assertEquals(true, newBag.contains(item));

    }

    @Test
    void testFalseContains() {
        Bag<String> newBag = new Bag<>();
        String item = "Apple";
        newBag.add(item);
        assertEquals(false, newBag.contains("Banana"));

    }

    @Test
    void testPositiveCount() {
        Bag<String> newBag = new Bag<>();
        String item = "Apple";
        newBag.add(item);
        assertEquals(1, newBag.count(item));
    }

    @Test
    void testNullCount() {
        Bag<String> newBag = new Bag<>();
        String item = "Apple";
        newBag.add(item);
        assertEquals(null, newBag.count("Banana"));
    }

    @Test
    void testRemove() {
        Bag<String> newBag = new Bag<>();
        String item = "Apple";
        newBag.add(item);
        newBag.remove(item);
        assertEquals(false, newBag.contains("Banana"));

    }

    @Test
    void testToString() {
        Bag<String> newBag = new Bag<>();
        newBag.add("Apple");
        newBag.add("Banana");
        assertEquals("{Apple=1, Banana=1}", newBag.toString());

    }
}
