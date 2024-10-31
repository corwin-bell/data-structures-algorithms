package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import main.ArrayQueue;
import main.Person;
import main.PersonQueueApp;

public class PersonQueueAppTest {
    private InputStream originalSystemIn;
    private ArrayQueue<Person> personQueue;
    @BeforeEach
    public void setUp() {
        personQueue = new ArrayQueue<>();
    }

    @Test
    void testDequeue() {

    }

    
    @Test
    public void testEnqueuePerson() {
        originalSystemIn = System.in;
        // Prepare multiple inputs separated by newlines
        String simulatedInput = String.join("\n",
            "John", // first name
            "Smith",  // last name
            "25\n"        // age
        );
        try (Scanner testScanner = new Scanner(new ByteArrayInputStream(simulatedInput.getBytes()));) {
            PersonQueueApp.enqueuePerson(personQueue, testScanner);
            assertEquals("first name: John, last name: Smith, age: 25", personQueue.first().toString());
        } finally {
            System.setIn(originalSystemIn);
        }
    }

    @Test
    void testListPersons() {

    }
}
