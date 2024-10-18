package main;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class CustomLinkedList {
    private Node head;

    public Iterator<Node> nodeIterator() {
        return new LinkedListNodeIterator();
    }

         // Other methods...
    // TODO: create insert(int data): Inserts a new node with the given data.
    public void insert (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;     
        }
    }
    // TODO: create delete(int data): Deletes the first occurrence of a node with the given data.
    public void delete (int data) {
        // iterate through linked list
        while (nodeIterator().hasNext()) {
            Node current = nodeIterator().next();
            // if node.next.data == data
            if (current.next.data == data) {
                Node remove = current.next;
                // point node.next to remove.next
                current.next = remove.next;
                // set node.next to null for garbage collection
                remove = null;
                System.out.println("node " + data + " removed.");
            }          
        }
                
    }
    // TODO: create a toString override that returns list of contents as string [1,2,3,4]
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        Iterator<Node> nodeIterator = nodeIterator();
        String listString = "";
        while (nodeIterator.hasNext()) {
        listString = listString + " " + nodeIterator.next().data;
        }
        return listString;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private class LinkedListNodeIterator implements Iterator<Node> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Node next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node temp = current;
            current = current.next;
            return temp;
        }
    }


}


