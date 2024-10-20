package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class CustomLinkedListApp {
    public static void insertFromTextFile(String filePath, CustomLinkedList linkedList) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int data;
            while ((line = br.readLine()) != null) {
                data = Integer.parseInt(line);
                linkedList.insert(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        System.out.println(linkedList.toString());

        // delete first element
        linkedList.delete(3);
        System.out.println(linkedList.toString());
        
        // use public iterator
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // insert elements from file
        CustomLinkedList linkedListFromFile = new CustomLinkedList();
        insertFromTextFile("./ints.txt", linkedListFromFile);
        System.out.println(linkedListFromFile.toString());
    }
}
