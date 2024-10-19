package main;

public class Main {
    // TODO: Provide the functionality to read integer data from a text file.
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        System.out.println(linkedList.toString());

        // delete first element
        linkedList.delete(6);
        System.out.println(linkedList.toString());

        // delete middle element
        linkedList.delete(4);
        System.out.println(linkedList.toString());

        // delete last element
        linkedList.delete(1);
        System.out.println(linkedList.toString());
        
    }
}
