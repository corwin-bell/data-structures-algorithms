import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class PostfixCalculator {

    // members
    private StringTokenizer postfixTokens;
    private Stack<Double> postfixStack;

    // Default constructor
    public PostfixCalculator() {}
    // methods
    // check if token is parseable to double
    private boolean isDouble (String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // TODO: refactor based on this: https://www.geeksforgeeks.org/evaluation-of-postfix-expression/
    public Double calculate(String postfixStr) {
        try {
            postfixTokens = new StringTokenizer (postfixStr, " ");
            String token = "";  
            String[] operatorArray = {"+", "-", "*", "/", "%"};
            Double operand1;
            Double operand2;
            // TODO: refactor as split of string into string array
            while (postfixTokens.hasMoreTokens()) {
                token = postfixTokens.nextToken();
                System.out.println("token: " + token);
                // // if term is a double operand, push to stack, need to check validity
                if (isDouble(token)) {
                    System.out.println("is double: " + token);
                    postfixStack.push(Double.valueOf(token));
                }
                // else if (Arrays.asList(operatorArray).contains(token)) {
                //     System.out.println("is operator: " + token);
                //     operand2 = postfixStack.pop();
                //     operand1 = postfixStack.pop();
                //     switch (token) {
                //         case "+":
                //             postfixStack.push(operand1 + operand2);
                //             break;
                //         default:
                //             break;
                //     } 
                //     // pop operands off stack,
                //     // perform operation
                //     // push result back to stack
                //     System.out.println("TODO: add calculate method");
                // }
                // else {
                //     // throw error since it's an invalid string
                //     continue;
                // }
            }
            System.out.println("result: " + postfixStack.peek());
            return postfixStack.pop();    
        } catch (Exception e) {
            // TODO: handle exception
            return -1.0;
        }

    }
        // try handle invalid postfixExpression error
            
        // catch invalid postfixExpression, print error message
}
