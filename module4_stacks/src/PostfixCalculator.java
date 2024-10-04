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
    public Double calculate(String postfixStr) {
        try {
            postfixTokens = new StringTokenizer (postfixStr, " +-*/", true);
            String token = "";  
            while (postfixTokens.hasMoreTokens()) {
                token = postfixTokens.nextToken();
                System.out.println(token);
                // if term is a float operand, push to stack, need to check validity
                if (isDouble(token)) {
                    postfixStack.push(Double.valueOf(token));
                }
            }
            // if operator (+, -, *, /, %), 
                // pop operands off stack,
                // perform operation
                // push result back to stack
            return postfixStack.pop();    
        } catch (Exception e) {
            // TODO: handle exception
            return -1.0;
        }

    }
        // try handle invalid postfixExpression error
            
        // catch invalid postfixExpression, print error message
}
