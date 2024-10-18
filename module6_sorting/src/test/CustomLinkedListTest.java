package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Iterator;
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
        String resultStr = "";
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            resultStr = resultStr + " " + iterator.next();
        }
        assertEquals(" 3 2 1", resultStr);
    }
}
