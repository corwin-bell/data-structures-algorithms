package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.Person;
import main.QuickSorter;

import java.util.Comparator;

public class QuickSorterTest {
    private Person[] inArray;
    private int first;
    private int last;
    @BeforeEach
    void setUp() {
        inArray = new Person[3];
        inArray[0] = new Person("John", "Smith", 25);
        inArray[1] = new Person("Zoe", "Adams", 20);
        inArray[2] = new Person("Al", "Johnson", 15);
        first = 0;
        last = inArray.length -1;
    }
    @Test
    void testQuickSortInPlaceAscending(){
        Comparator<Person> sortFNameAsc = (Person p1, Person p2)->p1.getFirstName().compareTo(p2.getFirstName());
        QuickSorter.quickSortInPlace(inArray, sortFNameAsc, first, last);
        String testString = "Al John Zoe ";
        String sortedArrayNames = "";
        for (Person person: inArray) {
            sortedArrayNames += person.getFirstName() + " ";
        }
        assertEquals(testString, sortedArrayNames); 
    }

    @Test
    void testQuickSortInPlaceDescending(){
        Comparator<Person> sortFNameDesc = (Person p1, Person p2)->p2.getFirstName().compareTo(p1.getFirstName());
        QuickSorter.quickSortInPlace(inArray, sortFNameDesc, first, last);
        String testString = "Zoe John Al ";
        String sortedArrayNames = "";
        for (Person person: inArray) {
            sortedArrayNames += person.getFirstName() + " ";
        }
        assertEquals(testString, sortedArrayNames); 
    }
}
