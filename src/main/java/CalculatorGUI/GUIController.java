package CalculatorGUI;
import javafx.scene.control.Button;

import java.util.LinkedList;

public class GUIController extends GUI {
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
        GUI.inputAreaQuaternary.appendText(String.valueOf(quaternaryInt));
        quaternaryOperationInstructions.add(String.valueOf(quaternaryInt));
    }

    //display-edit Buttons
    static Button clear = GUI.clear;
    static Button delete = GUI.delete;
    protected static void attachEditButtonCodes(){
        clear.setOnAction(e -> clearOutputDisplay());
        delete.setOnAction(e -> deleteLastTypedDigit());
    }
    private static void clearOutputDisplay(){
        for(String characterTyped : quaternaryOperationInstructions){
            quaternaryOperationInstructions.remove(characterTyped);
        }
    }
    private static void deleteLastTypedDigit(){
        quaternaryOperationInstructions.removeLast();
    }

    //operation Buttons
    static Button add = GUI.plus;
    static Button subtract = GUI.minus;
    static Button times = GUI.multiply;
    static Button dividedBy = GUI.divide;
    static Button squareRoot = GUI.squareRoot;
    static Button nRoot = GUI.nRoot;
    static Button equals = GUI.equals;
    protected static void attachOperationButtonCodes(){
        add.setOnAction(e -> storeOperator(operations[0]));
        subtract.setOnAction(e -> storeOperator(operations[1]));
        times.setOnAction(e -> storeOperator(operations[2]));
        dividedBy.setOnAction(e -> storeOperator(operations[3]));
        squareRoot.setOnAction(e -> storeOperator(operations[4]));
        nRoot.setOnAction(e -> storeOperator(operations[5]));
        equals.setOnAction(e -> performOperation());
    }

    private static void performOperation() {
        //Need to:
        //check for invalid input
        //find answer
        //display output (decimal and quaternary)
        if(operationValueFlag){
            for(int i=0; i<=operations.length-1; i++){
                if(currentOperator.equals(operations[i])){
                    GUI.outputToggleArea.appendText("still thinking...");
                }
            }
        }
    }

    private static void storeOperator(String operator){
        operationValueFlag = true;
        currentOperator = operator;
        quaternaryOperationInstructions.add(operator);
    }
    //class variables
    private static boolean operationValueFlag;
    private static final LinkedList<String> quaternaryOperationInstructions = new LinkedList<>();
    private static final String[] operations = {"+", "-", "x", "÷", "√", "n*√", "="};
    private static String currentOperator;
    static void attachButtonCodes(){
        attachDigitButtonCode();
        attachOperationButtonCodes();
        attachEditButtonCodes();
    }


}
