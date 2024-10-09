package examples_files;

import java.util.Stack;
public class ReverseStringStack {
    public static void main(String[] args) {
        // enter mysterious string
        String inString = "amanap lanac a nalp a nam a"; 
        
        // add string characters to stack for further analysis
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < inString.length(); i++) {
            charStack.push(inString.charAt(i));
        }
        
        // print string characters in reverse order to investigate 
        while (charStack.size() > 0) {
            System.out.print(charStack.pop());
        }
        System.out.println();
        // prints the palindrome "a man a plan a canal panama"!

    }
}
