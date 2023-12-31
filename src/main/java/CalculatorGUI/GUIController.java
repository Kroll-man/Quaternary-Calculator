package CalculatorGUI;
import CalculatorLogic.Calculator;
import javafx.scene.control.Button;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class GUIController extends GUI {
    static Calculator calculator = new Calculator(false);

    private static void updateDisplay() {
        GUI.displayAreaPrimary.setText(String.valueOf(calculator.displayValue()));
        GUI.displayAreaSecondary.setText(String.valueOf(calculator.secondValue()));
    }
    //digit Buttons
    static Button zero = GUI.zero;
    static Button one = GUI.one;
    static Button two = GUI.two;
    static Button three = GUI.three;
    protected static void attachDigitButtonCode(){
        zero.setOnAction(e -> readDigitInput(0));
        one.setOnAction(e -> readDigitInput(1));
        two.setOnAction(e -> readDigitInput(2));
        three.setOnAction(e -> readDigitInput(3));
    }
    private static void readDigitInput(int quaternaryInt){
        calculator.addDigit(quaternaryInt);
        updateDisplay();
    }

    //display-edit Buttons
    static Button clear = GUI.clear;
    static Button delete = GUI.delete;
    protected static void attachEditButtonCodes(){
        clear.setOnAction(e -> clearOutputDisplay());
        delete.setOnAction(e -> deleteLastTypedDigit());
    }
    private static void clearOutputDisplay(){
        calculator.clear();
        updateDisplay();
    }
    private static void deleteLastTypedDigit(){
        calculator.deleteDigit();
        updateDisplay();
    }

    //operation Buttons
    static Button add = GUI.plus;
    static Button subtract = GUI.minus;
    static Button times = GUI.multiply;
    static Button dividedBy = GUI.divide;
    static Button squareRoot = GUI.squareRoot;
    static Button square = GUI.square;
    static Button equals = GUI.equals;
    static Button decimalToggle = GUI.displayToggle;
//    static Button quaternaryToggle = GUI.quaternaryToggle;
    protected static void attachOperationButtonCodes(){
        add.setOnAction(e -> {
            calculator.add();
            updateDisplay();
        });
        subtract.setOnAction(e -> {
            calculator.subtract();
            updateDisplay();
        });
        times.setOnAction(e -> {
            calculator.multiply();
            updateDisplay();
        });
        dividedBy.setOnAction(e -> {
            calculator.divide();
            updateDisplay();
        });
        squareRoot.setOnAction(e -> {
            calculator.squareRoot();
            updateDisplay();
        });
        square.setOnAction(e -> {
            calculator.square();
            updateDisplay();
        });
        equals.setOnAction(e -> {
            calculator.equals();
            updateDisplay();
        });
        decimalToggle.setOnAction(event -> {
            calculator.toggleDisplay();
            updateDisplay();
        });

        displayAreaPrimary.setOnMouseClicked(e -> {
            Clipboard clipboard = Clipboard.getSystemClipboard();
            ClipboardContent content = new ClipboardContent();
            content.putString(displayAreaPrimary.getText());
            clipboard.setContent(content);
        });
    }

    static void attachButtonCodes(){
        attachDigitButtonCode();
        attachOperationButtonCodes();
        attachEditButtonCodes();
        updateDisplay();
    }


}
