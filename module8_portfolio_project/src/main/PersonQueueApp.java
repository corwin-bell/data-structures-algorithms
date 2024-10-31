package main;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PersonQueueApp {
    public static void main(String[] args) throws Exception {
        // Prompt the user of the program to add five people to the queue. 
        // provide the contents of the queue
        // sort the queue using the quick sort descending order by last name
        // sort the queue using the quick sort descending order by age
        ArrayQueue<Person> personQueue = new ArrayQueue<>();
        String command = "";
        try (Scanner scnr = new Scanner(System.in)) {
            while (!command.equalsIgnoreCase("quit")) {
                System.out.println("Commands: 'enqueuePerson', 'listPersons', 'dequeue', 'sort', 'quit'");
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
                else if (command.equalsIgnoreCase("sort")) {
                    // sort(personQueue);
                }
                else if (!command.equalsIgnoreCase("quit")) {
                    System.out.println("Command not recognized");
                }
            }   
        }       
    }
    
    public static void enqueuePerson(ArrayQueue<Person> personQueue, Scanner scnr) {
        // add new person to personQueue inventory
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
    }
    
    public static void listPersons(ArrayQueue<Person> personQueue) {
        // print all persons in list to a new line
        if (personQueue.isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else {
            System.out.println(personQueue.toString()); 
        } 
    }
    
    public static void dequeue(ArrayQueue<Person> personQueue) { 
        if (personQueue.isEmpty()) {
            System.out.println("Queue is empty."); 
        }
        else {
            System.out.printf("person: %s dequeued\n", personQueue.dequeue().getFirstName());
        }
    }
    
    public static void sort (ArrayQueue<Person> personQueue, Scanner scnr) {
        // specify which field to sort by
        System.out.println("Enter field to sort by: firstName, lastName, or age ");
        String field = scnr.nextLine();
        switch (field) {
            case "firstName":
                
                break;
            case "lastName":
                
                break;
            case "age":
                
                break;
            default:
                break;
        }        
        // specify descending or ascending
    }
}
