# Portfolio Project Option # 1: Person Class
Write a 2-page summary that outlines the lessons you have learned in this programming course. Reflect on how these lessons can be applied towards more effective coding.

Final Program:
Write a program that creates a Person class that contains string that represent the first and last name of a person and their age. You will need to create a Queue class that will store each person in the queue and can sort the queue based on last name or age.

Prompt the user of the program to add five people to the queue. Your program should provide the contents of the queue and then sort the queue using the quick sort in two ways:

Descending order by last name
Descending order by age

## Queue Data Structure choice:
- Selected structure: Circular array: is fixed size and annoying with the circular array queue operations, but generally less overhead than linked-list and can directly be used for quicksort. Can implement array-resizing algorithm manually if I'm feeling inspired.

## Quicksort specification
- selected spec: random pivot seems easier to implement than median of 3, no need to control for very small arrays
