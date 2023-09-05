public class Calculator {
    QuaternaryConverter converter = new QuaternaryConverter();
    Boolean displayInDecimal;
    int value = 0;

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
}
