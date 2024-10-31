package main;



public class ArrayQueue<T> implements Queue<T>{
    // members, array
    private final int CAPACITY = 50; 
    private T[] arrayQueue;
    private int front = 0;
    private int size = 0;
    // constructors
    public ArrayQueue(){
        // TODO: either supress warning or use other approach
        this.arrayQueue = (T[]) new Object[CAPACITY];
    }

    public ArrayQueue(int capacity){
        this.arrayQueue = (T[]) new Object[capacity];
    }

    // methods
    
    // enqueue(e) Adds element to the back of queue
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

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
