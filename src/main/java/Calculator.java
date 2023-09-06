public class Calculator {
    QuaternaryConverter converter = new QuaternaryConverter();
    Boolean displayInDecimal;
    int value = 0;
    int secondValue = 0;
    int state = 0;

    public Calculator(Boolean displayInDecimal) {
        this.displayInDecimal = displayInDecimal;
    }

    public void toggleDisplay() {
        displayInDecimal = !displayInDecimal;
    }

    public int displayValue() {
        return displayInDecimal ? value : converter.toQuaternary(value);
    }

    public void addDigit(int digit) {
        value = converter.fromQuaternary(converter.toQuaternary(value) * 4 + digit);
    }

    public void clear() {
        value = 0;
    }

    private void swap() {
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
}
