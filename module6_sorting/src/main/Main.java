package main;

import java.util.Iterator;

public class Main {
    // TODO: Provide the functionality to read integer data from a text file.
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.toString());

        // test delete elements
        linkedList.delete(2);
        System.out.println("after remove 2: " + linkedList.toString());
        // Iterate and display elements
        
    }
}
