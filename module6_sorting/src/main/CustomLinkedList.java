package main;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class CustomLinkedList {
    private Node head;

    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
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

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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


