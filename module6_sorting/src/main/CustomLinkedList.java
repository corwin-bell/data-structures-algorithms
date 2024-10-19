package main;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class CustomLinkedList {
    private Node head;

    public Iterator<Node> nodeIterator() {
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
        // TODO: handle first and last node removal
        if (head.data == data) {
            head = head.next;
            System.out.println("head" + data + "removed.");
            return true;
        }
        // iterate through linked list
        while (nodeIterator().hasNext()) {
            Node current = nodeIterator().next();
            System.out.println("node: " + current.data);
            if (current.next.data == data) {
                Node temp = current.next;
                // point node.next to remove.next
                current.next = temp.next;
                // set node.next to null for garbage collection
                temp = null;
                System.out.println("node " + data + " removed.");
                return true;
            }
        }
        System.out.println("node" + data + " not found.");
        return false;
                
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


