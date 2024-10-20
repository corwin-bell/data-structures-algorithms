package main;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class CustomLinkedList {
    private Node head;
    private Iterator<Node> nodeIterator() {
        return new LinkedListNodeIterator();
    }

         // Other methods...
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
            // TODO: fix while loop next repeat val for head, why?
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


}


