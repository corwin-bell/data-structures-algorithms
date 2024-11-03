package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.util.Scanner;
import java.util.Arrays;
import main.ArrayQueue;
import main.Person;
import main.PersonQueueApp;

public class PersonQueueAppTest {
    private InputStream originalSystemIn;
    private ArrayQueue<Person> personQueue;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private String simulatedInput1;

    @BeforeEach
    public void setUp() {
        personQueue = new ArrayQueue<>();
        originalSystemIn = System.in;
        System.setOut(new PrintStream(outputStream));
        simulatedInput1 = String.join("\n",
            "John", // first name
            "Smith",  // last name
            "25\n"        // age
        );
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalSystemIn);
    }

    @Test
    void testDequeueEmpty() {
        String expectedOutput = "Queue is empty.\n";
        // assert print statment is returned
        PersonQueueApp.dequeue(personQueue);
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testDequeueNotEmpty() {
        String expectedOutput = "person: John dequeued";
        try (Scanner testScanner = new Scanner(new ByteArrayInputStream(simulatedInput1.getBytes()));) {
            PersonQueueApp.enqueuePerson(personQueue, testScanner);
            PersonQueueApp.dequeue(personQueue);
            String[] outputArray= outputStream.toString().split("\n");
            assertEquals(expectedOutput, outputArray[4]);
        }
    }
    
    @Test
    public void testEnqueuePerson() {
        try (Scanner testScanner = new Scanner(new ByteArrayInputStream(simulatedInput1.getBytes()));) {
            PersonQueueApp.enqueuePerson(personQueue, testScanner);
            String expectedOutput = "person added to queue";
            String[] outputArray= outputStream.toString().split("\n");
            assertEquals(expectedOutput, outputArray[3]);
        }
    }

    @Test
    void testListPersons() {
        String expectedOutput = "first name: John, last name: Smith, age: 25";
        try (Scanner testScanner = new Scanner(new ByteArrayInputStream(simulatedInput1.getBytes()));) {
            PersonQueueApp.enqueuePerson(personQueue, testScanner);
            PersonQueueApp.listPersons(personQueue);
            String[] outputArray= outputStream.toString().split("\n");
            assertEquals(expectedOutput, outputArray[4]);
        }
    }

    @Test
    void testSortFirstNameDesc() {
        String simulatedInput2 = String.join("\n",
        "Frank", // first name
        "Jones",  // last name
            "35\n"        // age
        );
        String simulatedInput3 = String.join("\n",
            "Zoe", // first name
            "Adams",  // last name
            "15\n"        // age
        );

        String sortField = "firstName\n";

        String combinedInput = simulatedInput1 + simulatedInput2 + simulatedInput3 + sortField;
        String expectedOutput = String.join("\n",
        "first name: Zoe, last name: Adams, age: 15",   
        "first name: John, last name: Smith, age: 25",
        "first name: Frank, last name: Jones, age: 35"
        );
        try (Scanner testScanner = new Scanner(new ByteArrayInputStream(combinedInput.getBytes()));) {
            PersonQueueApp.enqueuePerson(personQueue, testScanner);
            PersonQueueApp.enqueuePerson(personQueue, testScanner);
            PersonQueueApp.enqueuePerson(personQueue, testScanner);
            PersonQueueApp.sortDesc(personQueue, testScanner);
            PersonQueueApp.listPersons(personQueue);
            String[] outputArray = outputStream.toString().split("\n");
            String[] filterArray = Arrays.copyOfRange(outputArray, 13, outputArray.length);
            String filteredOutput = String.join("\n", filterArray);
            assertEquals(expectedOutput, filteredOutput);
        }

    }
}
