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
    public int delete (int data) {
        // iterate through linked list
        while (nodeIterator().hasNext()) {
            Node current = nodeIterator().next();
            System.out.println("node: " + current.data);
            // if node.next.data == data
            if (current.next.data == data) {
                Node temp = current.next;
                // point node.next to remove.next
                current.next = temp.next;
                // set node.next to null for garbage collection
                temp = null;
                System.out.println("node " + data + " removed.");
                return data;
            }
        }
        System.out.println("node" + data + " not found.");
        return -1;
                
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


