# Module 1: Java Bag Data Structure
In this assignment, you will implement a Java bag data structure, also known as a multiset. A bag is a collection of elements that allows duplicates and does not enforce any particular order. Your task is to design and implement a bag class in Java that supports basic operations such as adding elements, removing elements, checking if an element exists, and counting the occurrences of an element.

1. Design a Java class called `Bag` that implements the bag data structure.
2. The `Bag` class should have the following methods:
- `void add(T item)`: This method should add an item of type T to the bag.
- `void remove(T item)`: This method should remove one occurrence of the item from the bag, if it exists.
- `boolean contains(T item)`: This method should return true if the item exists in the bag; otherwise, it should return false.
- `int count(T item)`: Return count if exists, null if not.   
3. Write a Java program that demonstrates the usage of the `Bag` class. Your program should perform the following operations:
4. Comment your code appropriately to explain the functionality of each method.
- Create an instance of the `Bag` class.
- Add several elements to the bag, including duplicates.
- Print the bag contents.
- Test the `contains` method for a few elements.
- Test the `count` method for a few elements.
- Remove an element from the bag.
- Print the bag contents again
- Test the `contains` method for the removed element.
- Test the `count` method for the removed element.
Submit your completed assignment as a .java source code file.
