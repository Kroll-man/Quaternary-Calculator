package CalculatorGUI;
import CalculatorLogic.Calculator;
import javafx.scene.control.Button;

import java.util.LinkedList;

public class GUIController extends GUI {
    static Calculator calculator = new Calculator(false);

    private static void updateDisplay() {
        GUI.inputAreaQuaternary.setText(String.valueOf(calculator.displayValue()));
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
    static Button nRoot = GUI.nRoot;
    static Button equals = GUI.equals;
    static Button decimalToggle = GUI.decimalToggle;
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
        nRoot.setOnAction(e -> {
//            calculator.squareRoot();
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
    }

    static void attachButtonCodes(){
        attachDigitButtonCode();
        attachOperationButtonCodes();
        attachEditButtonCodes();
        updateDisplay();
    }


}
