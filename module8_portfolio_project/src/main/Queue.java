package main;

public interface Queue<T> {
    /** Returns the number of elements in the queue. */
    int size();

    /** Tests whether the queue is empty. */
    boolean isEmpty();

    /** Adds an element at the rear of the queue. */
    void enqueue(T e);

    /** Returns, but does not remove, the first element of the queue (null if empty). */
    T first();

   /** Removes and returns the first element of the queue (null if empty). */
    T dequeue();
}
