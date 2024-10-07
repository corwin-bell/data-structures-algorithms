import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostfixCalculatorTest {
    @Test
    void testAdditionPostfix() {
        PostfixCalculator calculator = new PostfixCalculator();
        String addPostfix = "4 20 + 3 +";
        Assertions.assertEquals(27, calculator.evaluatePostfix(addPostfix));    
    }

    @Test
    void testInvalidCharPostfix() {
        PostfixCalculator calculator = new PostfixCalculator();
        String invalidChar = "4 2 $";
        // key here is need for lambda expression to test correct throwing of exceptions
        Assertions.assertThrows(IllegalArgumentException.class, () -> { calculator.evaluatePostfix(invalidChar); });    
    }
}
