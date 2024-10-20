package main;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class CustomLinkedList {
    private Node head;
    
    /**
     * Private node iterator for use in LinkedList Class methods.
     * @return LinkedListNodeIterator object.
     */
    private Iterator<Node> nodeIterator() {
        return new LinkedListNodeIterator();
    }
    /**
     * Create new iterator object for linked list.
     * Has methods for iterating through list node integer values.
     * @return LinkedListIterator object.
     */
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

         // Other methods...
    /**
     * Insert node to head of linked list.
     * @param data integer for node to store.
     */
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
    
    /**
     * Deletes node that matches input integer.
     * @param data integer to match.
     * @return true if match found and node deleted, false if node not found.
     */
    public boolean delete (int data) {
        Iterator<Node> nodeIterator = nodeIterator();
        Node current = head;
        try {
            //  test head for data to delete
            if (current.data == data) {
                head = current.next;
                System.out.println("head " + data + " removed.");
                return true;
            }
            // TODO: fix while loop next repeat val for head
            while (nodeIterator.hasNext()) {
                System.out.println("node: " + current.data);
                if (current.next.data == data) {
                    Node temp = current.next;
                    current.next = temp.next;
                    temp = null;
                    System.out.println("node " + data + " removed.");
                    return true;
                }
                current = nodeIterator.next();
            }
            System.out.println("node" + data + " not found.");
            return false;            
        } 
        catch (NullPointerException e) {
            System.out.println("Cannot delete from an empty list.");
            return false;
        }
    }

    @Override
    public String toString() {
        Iterator<Node> nodeIterator = nodeIterator();
        String listString = "";
        while (nodeIterator.hasNext()) {
        listString = listString + " " + nodeIterator.next().data;
        }
        return listString;
    }

    /**
     * Checks if list is empty.
     * @return true if empty, false if not.
     */
    public boolean isEmpty() {
        Iterator<Node> nodeIterator = nodeIterator();
        return !nodeIterator.hasNext();
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

    private class LinkedListIterator implements Iterator<Integer> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int data = current.data;
            current = current.next;
            return data;
        }
    }
}


