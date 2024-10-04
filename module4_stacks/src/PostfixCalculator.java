import java.util.Stack;
import java.util.StringTokenizer;

public class PostfixCalculator {

    // members
    private StringTokenizer postfixTokens;
    private Stack<Double> postfixStack;

    // Default constructor
    public PostfixCalculator() {}
    // methods
    public Double calculate(String postfixStr) {
        try {
            postfixTokens = new StringTokenizer (postfixStr, " +-*/", true); 
            while (postfixTokens.hasMoreTokens()) {
                System.out.println(postfixTokens.nextToken());
            }
            // if term is a float operand, push to stack, need to check validity
            // if operator (+, -, *, /, %), 
                // pop operands off stack,
                // perform operation
                // push result back to stack
            return 0.0;    
        } catch (Exception e) {
            // TODO: handle exception
            return -1.0;
        }

    }
        // try handle invalid postfixExpression error
            
        // catch invalid postfixExpression, print error message
}
