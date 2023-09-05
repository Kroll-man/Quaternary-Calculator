import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testDisplayValue() {
        Calculator calculator = new Calculator(false);
        Assertions.assertEquals(0, calculator.displayValue());
    }

    @Test
    public void testAddDigit() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(1);
        Assertions.assertEquals(1, calculator.displayValue());
    }

    @Test
    public void testAddMultipleDigits() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(1);
        calculator.addDigit(2);
        Assertions.assertEquals(12, calculator.displayValue());
    }

    @Test
    public void testToggleDisplay() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(1);
        calculator.addDigit(2);
        calculator.toggleDisplay();
        Assertions.assertEquals(6, calculator.displayValue());
    }
}
