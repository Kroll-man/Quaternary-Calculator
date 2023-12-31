import CalculatorLogic.Calculator;
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
        calculator.addDigit(3);
        calculator.addDigit(0);
        Assertions.assertEquals(1230, calculator.displayValue());
    }

    @Test
    public void testAddManyDigits() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(1);
        calculator.addDigit(2);
        calculator.addDigit(3);
        calculator.addDigit(0);
        calculator.addDigit(1);
        calculator.addDigit(2);
        calculator.addDigit(3);
        calculator.addDigit(0);
        calculator.addDigit(1);
        calculator.addDigit(2);
        calculator.addDigit(3);
        calculator.addDigit(0);
        Assertions.assertEquals(123012301230L, calculator.displayValue());
    }

    @Test
    public void testToggleDisplay() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(1);
        calculator.addDigit(2);
        calculator.toggleDisplay();
        Assertions.assertEquals(6, calculator.displayValue());
    }

    @Test
    public void testClear() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(1);
        calculator.addDigit(2);
        calculator.clear();
        Assertions.assertEquals(0, calculator.displayValue());
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(2);
        calculator.add();
        calculator.addDigit(3);
        calculator.equals();
        Assertions.assertEquals(11, calculator.displayValue());
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(2);
        calculator.subtract();
        calculator.addDigit(3);
        calculator.equals();
        Assertions.assertEquals(-1, calculator.displayValue());
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(2);
        calculator.multiply();
        calculator.addDigit(3);
        calculator.equals();
        Assertions.assertEquals(12, calculator.displayValue());
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(10);
        calculator.divide();
        calculator.addDigit(2);
        calculator.equals();
        Assertions.assertEquals(2, calculator.displayValue());
    }

    @Test
    public void testDeleteDigit() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(1);
        calculator.addDigit(2);
        calculator.deleteDigit();
        Assertions.assertEquals(1, calculator.displayValue());
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(3);
        calculator.square();
        Assertions.assertEquals(21, calculator.displayValue());
    }

    @Test
    public void testSquareNegative() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(-3);
        calculator.square();
        Assertions.assertEquals(21, calculator.displayValue());
    }

    @Test
    public void testSquareRoot() {
        Calculator calculator = new Calculator(false);
        calculator.addDigit(2);
        calculator.addDigit(1);
        calculator.squareRoot();
        Assertions.assertEquals(3, calculator.displayValue());
    }

    @Test
    public void testSquareRootNegative() {
        Calculator calculator = new Calculator(false);
        calculator.subtract();
        calculator.addDigit(2);
        calculator.addDigit(1);
        calculator.equals();
        Assertions.assertEquals(-21, calculator.displayValue());
        calculator.squareRoot();
        Assertions.assertEquals(0, calculator.displayValue());
    }
}
