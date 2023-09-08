package CalculatorGUI;

import CalculatorLogic.Calculator;
import CalculatorLogic.QuaternaryConverter;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.LinkedList;

public class GUIController extends GUI {
    static Button zero = GUI.zero;
    static Button one = GUI.one;
    static Button two = GUI.two;
    static Button three = GUI.three;
    private static int firstDecimalValue;
    private static int secondDecimalValue;
    private static final LinkedList<String> quaternaryOperationInstructions = new LinkedList<>();
    static void attachCode(){
        zero.setOnAction(e -> readDigitInput(0));
        one.setOnAction(e -> readDigitInput(1));
        two.setOnAction(e -> readDigitInput(2));
        three.setOnAction(e -> readDigitInput(3));
    }

    static void readDigitInput(int quaternaryInt){
        GUI.inputAreaQuaternary.appendText(String.valueOf(quaternaryInt));

    }

}
