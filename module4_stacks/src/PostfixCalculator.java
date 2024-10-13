import java.util.Arrays;
import java.util.Stack;

public class PostfixCalculator {

    // members
    private Stack<Double> postfixStack;

    // Default constructor
    public PostfixCalculator() {
        this.postfixStack = new Stack<>();
    }
    
    /** 
     * Tests if a string is parseable to a Double value. 
     * @param str containing value to test.
     * @return boolean returns true if string is parseable to a Double, false if not.
     */
    private boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    /**
     * Performs a calculation based on supplied Double operands and string containing an operator value.
     * Calculation takes form: operand1, operator, operand2  
     * @param operand1
     * @param operand2
     * @param operator options include + addition, - subtraction, * multiplication, / division , and % modulus
     * @return Double result of calculation.
     * @exception IllegalArgumentException if invalid operator supplied
     * @exception ArithmeticException if division by zero occurs, i.e. operand2 is zero
     */
    // operate method
    private Double calculate(Double operand1, Double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;      
            case "%":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 % operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
    /**
     * Evaluates postfix expression for valid postfix notation.
     * If the postfix is valid, it will be calculated and return the result. 
     * @param postfixStr String representation of a postfix expression, operands and operators must be separated by a space (e.g. "3 2 +")
     * @return Double result of the postfix expression
     * @exception IllegalArgumentException if a postfix expression item is not parseable to Double or a valid operator
     * @exception java.util.EmptyStackException if the postfix expression does not contain enough operands for the number of operators (e.g. 3 2 + -) 
     */
    public Double evaluatePostfix(String postfixStr) {  
        // split postfix str to an array of postfix items
        String[] postfixArray = postfixStr.split(" ");    
        // store array of operators to test
        String[] operatorArray = {"+", "-", "*", "/", "%"};
        // declare operand variables to evaluate postfix expressions
        Double operand1;
        Double operand2;
        for (String item: postfixArray) {
            if (isDouble(item)) {
                postfixStack.push(Double.parseDouble(item));
            }
            else if (Arrays.asList(operatorArray).contains(item)) { 
                operand2 = postfixStack.pop();
                operand1 = postfixStack.pop();
                postfixStack.push(calculate(operand1, operand2, item));        
                }
            else {
                throw new IllegalArgumentException("Invalid postfix expression: " + item + " is not valid operand or operator");
            }
        } 
        return postfixStack.pop();    
    }
}

