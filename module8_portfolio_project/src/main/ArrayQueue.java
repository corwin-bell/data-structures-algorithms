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

    @Override
    public T dequeue() {
        if (isEmpty()) return null;
        T frontItem = queueArray[front];
        queueArray[front] = null;
        front = (front + 1) % queueArray.length;
        size--;
        return frontItem;
    }

    @Override
    public T first() {
        if (isEmpty()) return null;
        return queueArray[front];
        
    }    
}
