import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostfixCalculatorTest {
    @Test
    void testAdd() {
        PostfixCalculator calculator = new PostfixCalculator();
        String testString = "4 20 + 3 +";
        Assertions.assertEquals(27, calculator.evaluatePostfix(testString));    
    }

    @Test
    void testSubtract() {
        PostfixCalculator calculator = new PostfixCalculator();
        String testString = "5 3 - 7 -";
        Assertions.assertEquals(-5, calculator.evaluatePostfix(testString));        }

    @Test
    void testMultiply() {
        PostfixCalculator calculator = new PostfixCalculator();
        String testString = "4 2 * 3 *";
        Assertions.assertEquals(24, calculator.evaluatePostfix(testString));    
    }

    @Test
    void testDivide() {
        PostfixCalculator calculator = new PostfixCalculator();
        String testString = "4 2 / 2 /";
        Assertions.assertEquals(1, calculator.evaluatePostfix(testString));        }

    @Test
    void testFloorDivide() {
        PostfixCalculator calculator = new PostfixCalculator();
        String testString = "4 3 %";
        Assertions.assertEquals(1, calculator.evaluatePostfix(testString));        }

    @Test
    void testDivByZero() {
        PostfixCalculator calculator = new PostfixCalculator();
        String testString = "4 0 /";
        Assertions.assertThrows(ArithmeticException.class, () -> { calculator.evaluatePostfix(testString); });
    }    

    @Test
    void testMissingOperand() {
        PostfixCalculator calculator = new PostfixCalculator();
        String testString = "4 2 + 3 - *";
        Assertions.assertThrows(java.util.EmptyStackException.class, () -> { calculator.evaluatePostfix(testString); });
    }

    @Test
    void testInvalidOperator() {
        PostfixCalculator calculator = new PostfixCalculator();
        String invalidOperator = "4 2 $";
        // key here is need for lambda expression to test correct throwing of exceptions
        Assertions.assertThrows(IllegalArgumentException.class, () -> { calculator.evaluatePostfix(invalidOperator); });    
    }

    @Test
    void testEmptyInput() {
        PostfixCalculator calculator = new PostfixCalculator();
        String EmptyString = "";
        // key here is need for lambda expression to test correct throwing of exceptions
        Assertions.assertThrows(IllegalArgumentException.class, () -> { calculator.evaluatePostfix(EmptyString); });    
    }

    @Test
    void testNullInput() {
        PostfixCalculator calculator = new PostfixCalculator();
        String nullString = null;
        // key here is need for lambda expression to test correct throwing of exceptions
        Assertions.assertThrows(NullPointerException.class, () -> { calculator.evaluatePostfix(nullString); });    
    }
}
