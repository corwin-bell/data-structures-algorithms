package main;

import java.util.Comparator;

public class ArrayQueue<T> implements Queue<T>{
    // members
    private final int CAPACITY = 50; 
    private T[] arrayQueue;
    private int front = 0;
    private int size = 0;
    
    // constructors
    /** Default arrayQueue constructor with capacity of 50.
     * If longer queue desired, define capacity in paramaterized constructor. 
     */
    @SuppressWarnings("unchecked") // type casting will not be exposed so ok not to check
    public ArrayQueue(){
        this.arrayQueue = (T[]) new Object[CAPACITY];
    }

    /** 
     * @param capacity potential arrayQueue length limit
     */
    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity){
        this.arrayQueue = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    
    /** Adds item to end of queue if not full.
     * @param item to add to queue
     * @throws IllegalStateException if array storing queue is full. 
     * Must create new arrayQueue with more capacity if longer queue is desired.
     */
    @Override
    public void enqueue(T item) throws IllegalStateException{
        if (size == arrayQueue.length) throw new IllegalStateException("Queue is full");
        int queueEnd = (front + size) % arrayQueue.length;
        arrayQueue[queueEnd] = item;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) return null;
        T frontItem = arrayQueue[front];
        arrayQueue[front] = null;
        front = (front + 1) % arrayQueue.length;
        size--;
        return frontItem;
    }

    @Override
    public T first() {
        if (isEmpty()) return null;
        return arrayQueue[front];
        
    }
    
    /** Sorts queue in place with an appropriate comparator for the given queue item class.
     * @param comp user-defined comparator
     */
    public void sort(Comparator<T> comp){
        int back = front + size - 1;
        QuickSorter.quickSortInPlace(arrayQueue, comp, front, back);
    }

    @Override
    public String toString() {
        if (isEmpty()) return null;
        String queueString = "";
        for (int i = 0; i < size; i++) {
            int place = (front + i) % arrayQueue.length;
            queueString += arrayQueue[place].toString() + "\n";
        }
        return queueString;
    }
}
