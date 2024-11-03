package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ArrayQueue;
import main.Person;
import java.util.Comparator;

public class ArrayQueueTest {
    private ArrayQueue<Person> testArrayQueue;
    private Person john; 
    private Person frank;
    private Person Anne;
    @BeforeEach
    void setUp() {
        testArrayQueue = new ArrayQueue<>();
        john = new Person("John", "Smith", 25);
        frank = new Person("Frank", "Jones", 35);
        Anne = new Person("Anne", "Babson", 15); 
    }

    @Test
    void testDequeue() { 
        testArrayQueue.enqueue(john);
        testArrayQueue.enqueue(frank);
        Person frontItem = testArrayQueue.dequeue();
        assertEquals("John", frontItem.getFirstName());
        assertEquals(1, testArrayQueue.size());
    }

    @Test
    void testEnqueue() {
        testArrayQueue.enqueue(john);
        assertEquals(1, testArrayQueue.size());
    }

    @Test
    void testFirst() {
        testArrayQueue.enqueue(john);
        testArrayQueue.enqueue(frank);
        assertEquals("John", testArrayQueue.first().getFirstName());
        assertEquals(2, testArrayQueue.size());
    }

    @Test
    void testIsEmpty() {
        assertEquals(true, testArrayQueue.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(0, testArrayQueue.size());
    }

    @Test
    void testToString() {
        testArrayQueue.enqueue(john);
        testArrayQueue.enqueue(frank);
        testArrayQueue.enqueue(Anne);
        testArrayQueue.dequeue();
        String queueString = "first name: Frank, last name: Jones, age: 35\nfirst name: Anne, last name: Babson, age: 15\n";
        assertEquals(queueString, testArrayQueue.toString());        
    }

    @Test
    void testSortfirstNameDesc() {
        testArrayQueue.enqueue(john);
        testArrayQueue.enqueue(frank);
        testArrayQueue.enqueue(Anne);
        Comparator<Person> sortFNameDesc = (Person p1, Person p2)->p2.getFirstName().compareTo(p1.getFirstName());
        testArrayQueue.sort(sortFNameDesc);
        String queueString = String.join("\n",
         "first name: John, last name: Smith, age: 25",
         "first name: Frank, last name: Jones, age: 35",
         "first name: Anne, last name: Babson, age: 15\n"
         );
         assertEquals(queueString, testArrayQueue.toString());        
    }
}
