# Module 4 Option #1: Create a Postfix Calculator
Implement a postfix calculator in Java that evaluates arithmetic expressions in postfix notation. The program should support the basic arithmetic operations:
- addition (+)
- subtraction (-)
- multiplication (*)
- two division operations:  (/ and %)
Additionally, the program should handle operands and display the final result.

Requirements:
Your java code.

Screenshots showing the test of your code, where the following should be tested:
1. The program should handle both single-digit and multi-digit operands.
2. The program should handle valid postfix expressions.
3. Display an error message for invalid expressions.
4. Display the result for valid expressions.

Example:
public class PostfixCalculator {
    public int evaluatePostfix(String postfixExpression) {
        // Your implementation here
        // ...
        return 0; // Placeholder
    }

    public static void main(String[] args) {
        PostfixCalculator calculator = new PostfixCalculator();

        // Example 1: Valid Expression
        String expression1 = "42*3+";
        System.out.println("Result 1: " + calculator.evaluatePostfix(expression1));

        // Example 2: Valid Expression
        String expression2 = "53+7*";
        System.out.println("Result 2: " + calculator.evaluatePostfix(expression2));

        // Example 3: Invalid Expression
        String expression3 = "42*+"; // Missing operand
        System.out.println("Result 3: " + calculator.evaluatePostfix(expression3));
    }
}
Sample Output:

Result 1: 11
Result 2: 56
Error: Invalid postfix expression
Testing:

Your program should also be able to read a text file containing several expressions. Implement a function in your program to read each expression and evaluate it.