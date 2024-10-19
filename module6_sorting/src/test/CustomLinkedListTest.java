package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import main.CustomLinkedList;

public class CustomLinkedListTest {
    @Test
    void testInsert() {
        CustomLinkedList linkedList = new CustomLinkedList();
        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        assertEquals(" 3 2 1", linkedList.toString());
    }

    @Test
    void testDeleteMiddle() {
        CustomLinkedList linkedList = new CustomLinkedList();
        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        // delete middle element
        linkedList.delete(2);
        assertEquals(" 3 1", linkedList.toString());
    }

    @Test
    void testDeleteHead() {
        CustomLinkedList linkedList = new CustomLinkedList();
        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        // delete first element
        linkedList.delete(3);
        assertEquals(" 2 1", linkedList.toString());
    }

    @Test
    void testNodeIterator() {
        
    }

    @Test
    void testToString() {
        
    }
}
