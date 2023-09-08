package CalculatorLogic;
public class Calculator {
    QuaternaryConverter converter = new QuaternaryConverter();
    Boolean displayInDecimal;
    long value = 0;
    long secondValue = 0;
    int state = 0;

    public Calculator(Boolean displayInDecimal) {
        this.displayInDecimal = displayInDecimal;
    }

    public void toggleDisplay() {
        displayInDecimal = !displayInDecimal;
    }

    public void decimalDisplay() { displayInDecimal = true; }

    public void quaternaryDisplay() { displayInDecimal = false; }

    public long displayValue() {
        return displayInDecimal ? value : converter.toQuaternary(value);
    }

    public void addDigit(long digit) {
        value = converter.fromQuaternary(converter.toQuaternary(value) * 10 + digit);
    }

    public void deleteDigit() {
        value = converter.fromQuaternary(converter.toQuaternary(value) / 10);
    }

    public void clear() {
        value = 0;
    }

    private void swap() {
        if (state != 0)
            equals();

        secondValue = value;
        value = 0;
    }

    public void add() {
        swap();
        state = 1;
    }

    public void subtract() {
        swap();
        state = 2;
    }

    public void multiply() {
        swap();
        state = 3;
    }

    public void divide() {
        swap();
        state = 4;
    }

    public void equals() {
        switch (state) {
            case 1 -> value = secondValue + value;
            case 2 -> value = secondValue - value;
            case 3 -> value = secondValue * value;
            case 4 -> value = secondValue / value;
        }

        secondValue = 0;
        state = 0;
    }

    public void square() {
        value = value * value;
    }

    public void squareRoot() {
        if (value < 0) {
            value = 0;
            return;
        }

        value = (long) Math.sqrt(value);
    }
}
