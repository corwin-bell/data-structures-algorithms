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
    void testDeleteMiddle() {
        CustomLinkedList linkedList = new CustomLinkedList();
        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        // delete middle element
        linkedList.delete(3);
        assertEquals(" 4 2 1", linkedList.toString());
    }

    @Test
    void testDeleteTail() {
        CustomLinkedList linkedList = new CustomLinkedList();
        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        // delete last element
        linkedList.delete(1);
        assertEquals(" 3 2", linkedList.toString());
    }

    @Test
    void testDeleteNotFound() {
        CustomLinkedList linkedList = new CustomLinkedList();
        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        // delete element not in list
        assertEquals(false, linkedList.delete(4));
        assertEquals(" 3 2 1", linkedList.toString());
    }

    @Test
    void testDeleteEmptyList() {
        CustomLinkedList linkedList = new CustomLinkedList();

        // delete element not in list
        assertEquals(false, linkedList.delete(4));
    }

    @Test
    void testToString() {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        assertEquals(" 3 2 1", linkedList.toString());
    }

    @Test
    void testIsEmpty() {
        CustomLinkedList linkedList = new CustomLinkedList();
        assertEquals(true, linkedList.isEmpty());
    }

    @Test
    void testNotEmpty() {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        assertEquals(false, linkedList.isEmpty());
    }

}
