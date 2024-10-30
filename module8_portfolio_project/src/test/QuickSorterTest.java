package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import main.Person;
import main.QuickSorter;

import java.util.Comparator;

public class QuickSorterTest {
    @Test
    void testQuickSortInPlace(){
        Person[] inArray = new Person[3];
        inArray[0] = new Person("John", "Smith", 25);
        inArray[1] = new Person("Zoe", "Adams", 20);
        inArray[2] = new Person("Al", "Johnson", 15);
        int first = 0;
        int last = inArray.length -1;
        QuickSorter.quickSortInPlace(inArray, Comparator.comparing(Person::getFirstName), first, last);
        String testString = "Al John Zoe ";
        String sortedArrayNames = "";
        for (Person person: inArray) {
            sortedArrayNames += person.getFirstName() + " ";
        }
        assertEquals(testString, sortedArrayNames); 
    }
}
