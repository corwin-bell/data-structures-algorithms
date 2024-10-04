public class PostfixCalcTest {
    public static void main(String[] args) throws Exception {
        PostfixCalculator calculator = new PostfixCalculator();
        calculator.calculate("DOg+4*");
        // // Example 1: Valid Expression
        // String expression1 = "42*3+";
        // System.out.println("Result 1: " + calculator.evaluatePostfix(expression1));

        // // Example 2: Valid Expression
        // String expression2 = "53+7*";
        // System.out.println("Result 2: " + calculator.evaluatePostfix(expression2));

        // // Example 3: Invalid Expression
        // String expression3 = "42*+"; // Missing operand
        // System.out.println("Result 3: " + calculator.evaluatePostfix(expression3))
    }
}
