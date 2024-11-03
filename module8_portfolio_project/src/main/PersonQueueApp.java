package main;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Comparator;

public class PersonQueueApp {
    public static void main(String[] args) throws Exception {
        // TODO: run code and screenshot based on instructions
        // Prompt the user of the program to add five people to the queue. 
        // provide the contents of the queue
        // sort the queue using the quick sort descending order by last name
        // sort the queue using the quick sort descending order by age
        ArrayQueue<Person> personQueue = new ArrayQueue<>();
        String command = "";
        try (Scanner scnr = new Scanner(System.in)) {
            while (!command.equalsIgnoreCase("quit")) {
                System.out.println("Commands: 'enqueuePerson', 'listPersons', 'dequeue', 'sortDesc', 'quit'");
                command = scnr.nextLine();
                if (command.equalsIgnoreCase("enqueuePerson")) {
                    enqueuePerson(personQueue, scnr);
                }
                else if (command.equalsIgnoreCase("listPersons")) {
                    listPersons(personQueue);
                }
                else if (command.equalsIgnoreCase("dequeue")) {
                    dequeue(personQueue);
                }
                else if (command.equalsIgnoreCase("sortDesc")) {
                    sortDesc(personQueue, scnr);
                }
                else if (!command.equalsIgnoreCase("quit")) {
                    System.out.println("Command not recognized");
                }
            }   
        }       
    }
    
    /** Add Person object to queue based on user input.
     * @param personQueue
     * @param scnr 
     */
    public static void enqueuePerson(ArrayQueue<Person> personQueue, Scanner scnr) {
        try {
            System.out.println("Enter person first name: ");
            String firstName = scnr.nextLine();
            System.out.println("Enter person last name: ");
            String lastName = scnr.nextLine();
            System.out.println("Enter person age: ");
            int age = scnr.nextInt();
            scnr.nextLine(); // clear scnr for next input
            Person person = new Person(firstName, lastName, age);
            personQueue.enqueue(person);
            System.out.println("person added to queue");
        }
        catch (InputMismatchException e) {
            System.err.println("must enter correct data type for each field");
        }
        catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }
    
    /** Lists Person objects in queue order.
     * @param personQueue 
     */
    public static void listPersons(ArrayQueue<Person> personQueue) {
        // print all persons in list to a new line
        if (personQueue.isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else {
            System.out.println(personQueue.toString()); 
        } 
    }
    
    /** Remove and print Person object from front of queue.
     * @param personQueue
     */
    public static void dequeue(ArrayQueue<Person> personQueue) { 
        if (personQueue.isEmpty()) {
            System.out.println("Queue is empty."); 
        }
        else {
            System.out.printf("person: %s dequeued\n", personQueue.dequeue().getFirstName());
        }
    }
    
    /** Sort personQueue by descending order user-selected field: firstName, lastName, or age.
     * @param personQueue
     * @param scnr
     */
    public static void sortDesc (ArrayQueue<Person> personQueue, Scanner scnr) {
        System.out.println("Enter field to sort by: firstName, lastName, or age ");
        String field = scnr.nextLine();
        switch (field) {
            case "firstName":
                Comparator<Person> sortFNameDesc = (Person p1, Person p2)->p2.getFirstName().compareTo(p1.getFirstName());
                personQueue.sort(sortFNameDesc);            
                break;
            case "lastName":
                Comparator<Person> sortLNameDesc = (Person p1, Person p2)->p2.getLastName().compareTo(p1.getLastName());
                personQueue.sort(sortLNameDesc);            
                break;
            case "age":
                Comparator<Person> sortAgeDesc = (Person p1, Person p2)->p2.getAge() - p1.getAge();
                personQueue.sort(sortAgeDesc);
                break;
            default:
                System.out.println("Must enter valid field name.");
                break;
        }        
    }
}
