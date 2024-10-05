
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PostfixCalcTest {
    public static void testPostfix(String postfixExpression, String expectedResult) {
        PostfixCalculator calculator = new PostfixCalculator();
        String resultString = "Expected " + expectedResult + ", got: ";
        try {
            resultString += calculator.evaluatePostfix(postfixExpression); 
        } 
        catch (IllegalArgumentException e) {
            resultString += e.getMessage();
        }
        catch (ArithmeticException e) {
            resultString += e.getMessage();
        }
        catch (java.util.EmptyStackException e){
            resultString += e.getMessage() + ", Missing operand";
        }
        System.out.println(resultString);
    }

    // expected result and postfix expression delimmited by : 
    public static void testPostfixFromTextFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String[] inputArray = new String[2];
            String expectedResult;
            String postfixExpression;
            while ((line = br.readLine()) != null) {
                inputArray  = line.split(":");
                expectedResult = inputArray[0];
                postfixExpression = inputArray[1];
                testPostfix(postfixExpression, expectedResult);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        // Test operator correctness with valid postfix input
        String addPostfix = "4 2 + 3 +";
        testPostfix(addPostfix, "9");
        
        String subtractPostfix = "5 3 - 7 -";
        testPostfix(subtractPostfix, "-5");

        String multiplyPostfix = "4 2 * 3 *";
        testPostfix(multiplyPostfix, "24");

        String dividePostfix = "4 2 / 3 /";
        testPostfix(dividePostfix, "0.66");

        String floorDivPostfix = "4 3 %";
        testPostfix(floorDivPostfix, "1");

        // Test invalid mathematical expressions
        String divByZero = "4 0 /";
        testPostfix(divByZero, "Division by zero");

        // Test invalid postfix notation
        String invalidChar = "4 2 $";
        testPostfix(invalidChar, "Invalid postfix expression");

        String missingOperand = "4 2 + 3 - *";
        testPostfix(missingOperand, "Missing operand");

        // test from postfix file
        System.out.println("Test from file");
        testPostfixFromTextFile("./postfixExpressions.txt");
    }
}
