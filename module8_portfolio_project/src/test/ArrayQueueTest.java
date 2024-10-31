package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.ArrayQueue;
import main.Person;

public class ArrayQueueTest {
    @Test
    void testDequeue() {
        Person john = new Person("John", "Smith", 25);
        Person frank = new Person("Frank", "Jones", 35);
        ArrayQueue<Person> testArrayQueue = new ArrayQueue<>();
        testArrayQueue.enqueue(john);
        testArrayQueue.enqueue(frank);
        Person frontItem = testArrayQueue.dequeue();
        assertEquals("John", frontItem.getFirstName());
        assertEquals(1, testArrayQueue.size());
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
        Person john = new Person("John", "Smith", 25);
        Person frank = new Person("Frank", "Jones", 35);
        ArrayQueue<Person> testArrayQueue = new ArrayQueue<>();
        testArrayQueue.enqueue(john);
        testArrayQueue.enqueue(frank);
        assertEquals("John", testArrayQueue.first().getFirstName());
        assertEquals(2, testArrayQueue.size());
    }

    @Test
    void testIsEmpty() {
        ArrayQueue<Person> testArrayQueue = new ArrayQueue<>();
        assertEquals(true, testArrayQueue.isEmpty());
    }

    @Test
    void testSize() {
        ArrayQueue<Person> testArrayQueue = new ArrayQueue<>();
        assertEquals(0, testArrayQueue.size());
    }
}
