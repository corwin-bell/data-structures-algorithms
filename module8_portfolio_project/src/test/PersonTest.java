package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import main.Person;

public class PersonTest {
    @Test
    void testSetGetAge() {
        Person testPerson = new Person();
        testPerson.setAge(5);
        assertEquals(5, testPerson.getAge());
    }

    @Test
    void testSetGetFirstName() {
        Person testPerson = new Person();
        testPerson.setFirstName("Joe");
        assertEquals("Joe", testPerson.getFirstName());
    }

    @Test
    void testSetGetLastName() {
        Person testPerson = new Person();
        testPerson.setLastName("Smith");
        assertEquals("Smith", testPerson.getLastName());
    }

    @Test
    void testToString() {
        Person testPerson = new Person("Joe", "Smith", 5);
        assertEquals("first name: Joe, last name: Smith, age: 5", testPerson.toString());
    }
}
