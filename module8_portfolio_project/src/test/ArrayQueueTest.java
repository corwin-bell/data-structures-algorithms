package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.ArrayQueue;
import main.Person;

public class ArrayQueueTest {
    @Test
    void testDequeue() {

    }

    @Test
    void testEnqueue() {
        Person testPerson = new Person("John", "Smith", 25);
        ArrayQueue<Person> testArrayQueue = new ArrayQueue<>();
        testArrayQueue.enqueue(testPerson);
        assertEquals(1, testArrayQueue.size());
    }

    @Test
    void testFirst() {

    }

    @Test
    void testIsEmpty() {
        ArrayQueue testArrayQueue = new ArrayQueue<>();
        assertEquals(true, testArrayQueue.isEmpty());
    }

    @Test
    void testSize() {
        ArrayQueue testArrayQueue = new ArrayQueue<>();
        assertEquals(0, testArrayQueue.size());
    }
}
