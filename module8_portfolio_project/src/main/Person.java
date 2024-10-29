package main;

public class Person {
    // members
    private String firstName;
    private String lastName;
    private int age;
    // constructors
    public Person(){
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // methods, get, set, toString
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("first name: %s, last name: %s, age: %d", firstName, lastName, age);
    }
}
