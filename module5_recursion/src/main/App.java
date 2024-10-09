package main;

import example_files.ReverseStringRecurse;

public class App {
    public static void main(String[] args) throws Exception {
        ReverseStringRecurse stringreverser = new ReverseStringRecurse();
        String reversedString = stringreverser.reverseString("amanap lanac a nalp a nam a");
        System.out.println(reversedString);
    }
}
