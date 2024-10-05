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
    private Double operate(Double operand1, Double operand2, String operator) {
        // add try catch for divide by zero and other weird math behavior
        switch (operator) {
            case "+":
            return operand2 + operand1;
            case "-":
            return operand2 - operand1;
            case "*":
            return operand2 * operand1;
            case "/":
            return operand2 / operand1;
            case "%":
            return operand2 % operand1;
            default:
                return -1.0;
        }
    }
    public Double calculate(String postfixStr) {  
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
                System.out.println("item: " + postfixStack.peek() + " added to stack.");
            }
            else if (Arrays.asList(operatorArray).contains(item)) {
                // try catch for EmptyStackException
                operand1 = postfixStack.pop();
                operand2 = postfixStack.pop();
                postfixStack.push(operate(operand1, operand2, item));
                System.out.println(operand2 + item + operand1 + " = " + postfixStack.peek() + " added to stack");
            }
            else {
                System.out.println("Invalid Postfix");
            }
        }
            // if double, push to stack
            // if operator, pop last two stack items, operate, push result to stack
            // else, invalid input   
        System.out.println("result: " + postfixStack.peek());
        return postfixStack.pop();    
    }

}

