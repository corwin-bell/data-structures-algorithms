import java.util.Arrays;
import java.util.Stack;

public class PostfixCalculator {

    // members
    private Stack<Double> postfixStack;

    // Default constructor
    public PostfixCalculator() {
        this.postfixStack = new Stack<>();
    }
    // methods
    // isDouble method
    private boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // operate method
    private Double calculate(Double operand1, Double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand2 + operand1;
            case "-":
                return operand2 - operand1;
            case "*":
                return operand2 * operand1;
            case "/":
                if (operand1 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand2 / operand1;      
            case "%":
                if (operand1 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand2 % operand1;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    public Double evaluatePostfix(String postfixStr) {  
        // split postfix str to an array of postfix items
        String[] postfixArray = postfixStr.split(" ");    
        // store array of operators to test
        String[] operatorArray = {"+", "-", "*", "/", "%"};
        // declare operand variables to evaluate postfix expressions
        Double operand1;
        Double operand2;
        // for each item in array
        for (String item: postfixArray) {
            if (isDouble(item)) {
                postfixStack.push(Double.parseDouble(item));
                // System.out.println("item: " + postfixStack.peek() + " added to stack.");
            }
            else if (Arrays.asList(operatorArray).contains(item)) { 
                operand1 = postfixStack.pop();
                operand2 = postfixStack.pop();
                postfixStack.push(calculate(operand1, operand2, item));
                // System.out.println(operand2 + item + operand1 + " = " + postfixStack.peek() + " added to stack");        
                }
            else {
                throw new IllegalArgumentException("Invalid postfix expression: " + item + " is not valid operand or operator");
            }
        } 
        // System.out.println("result: " + postfixStack.peek());
        return postfixStack.pop();    
    }

}

