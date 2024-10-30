package main;



public class ArrayQueue<T> implements Queue<T>{
    // members, array
    private final int CAPACITY = 50; 
    private T[] queueArray;
    private int front = 0;
    private int size = 0;
    // constructors
    public ArrayQueue(){
        // TODO: either supress warning or use other approach
        this.queueArray = (T[]) new Object[CAPACITY];
    }

    public ArrayQueue(int capacity){
        this.queueArray = (T[]) new Object[capacity];
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
        if (size == queueArray.length) throw new IllegalStateException("Queue is full");
        int queueEnd = (front + size) % queueArray.length;
        queueArray[queueEnd] = item;
        size++;
    }
    // dequeue() Removes and returns the first element from the queue (or null if the queue is empty)
    @Override
    public T dequeue() {
        // TODO Auto-generated method stub
        return null;
    }
    // first() Returns the first element of the queue, without removing it (or null if the queue is empty)

    @Override
    public T first() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'first'");
    }    
}
