package CalculatorGUI;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class GUI extends Application {
    //creating controls
    static TextArea inputAreaQuaternary = new TextArea();
    static TextArea outputToggleArea = new TextArea();
    static Button zero = new Button("0");
    static Button one = new Button("1");
    static Button two = new Button("2");
    static Button three = new Button("3");
    static Button plus = new Button("+");
    static Button minus = new Button("-");
    static Button divide = new Button("÷");
    static Button multiply = new Button("x");
    static Button squareRoot = new Button("√");
    static Button nRoot = new Button("n*√");
    Button decimalToggle = new Button("DECIMAL");
    Button quaternaryToggle = new Button("QUATERNARY");
    static Button clear = new Button("CLR");
    static Button delete = new Button("DEL");
    static Button equals = new Button("=");
    GridPane calculatorRoot = new GridPane();
    //methods that launch application:
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        configureWindow(primaryStage);
    }
    private void configureWindow(Stage stage) {
        stage.setScene(new Scene(new VBox(setupGridPaneAlignment()), 500,550, Paint.valueOf("#add8e6")));
        stage.setTitle("~ QUATERNARY CALCULATOR ~ (CS 495 Group 6)");
        stage.sizeToScene();
        stage.show();
    }
    //building GUI Calculator structure:
    private GridPane setupGridPaneAlignment() {
        calculatorRoot.setStyle("#add8e6");
        calculatorRoot.setAlignment(Pos.CENTER);
        calculatorRoot.setHgap(10);
        calculatorRoot.setVgap(10);
        //input & output text areas
        calculatorRoot.add(inputAreaQuaternary, 1,0,7,1);
        calculatorRoot.add(outputToggleArea, 13,0,9,14);
        //delete and clear buttons
        calculatorRoot.add(delete,8,1,2,2);
        calculatorRoot.add(clear, 9, 1, 2, 2);
        //number input buttons
        calculatorRoot.add(zero,3,4,1,3);
        calculatorRoot.add(one, 5, 4, 1, 3);
        calculatorRoot.add(two, 3,8,1,3);
        calculatorRoot.add(three, 5,8,1,3);
        calculatorRoot.add(equals,3,13,3,1);
        //operation buttons
        calculatorRoot.add(plus, 8,5,1,2);
        calculatorRoot.add(minus, 9,5,1,2);
        calculatorRoot.add(multiply,8,7,1,2);
        calculatorRoot.add(divide,9,7,1,2);
        calculatorRoot.add(squareRoot, 8,9,2,3);
        calculatorRoot.add(nRoot,9,9,5,3);
        //toggle buttons
        calculatorRoot.add(decimalToggle,12,14,4,1);
        calculatorRoot.add(quaternaryToggle, 17,14,6,1);
        setControlProperties();
        GUIController.attachButtonCodes();
        return calculatorRoot;
    }
    private void setControlProperties(){
        Button[] controlButtonSet = {one, two, three, zero, equals, plus, minus, squareRoot, multiply, divide};
        for(int i=0; i<=controlButtonSet.length-1; i++){
            Button button = controlButtonSet[i];
            button.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        }
        clear.setFont(Font.font("Verdana", FontWeight.BOLD, 9));
        delete.setFont(Font.font("Verdana", FontWeight.BOLD, 9));
        nRoot.setFont(Font.font("Verdana", FontWeight.BOLD, 7));
        nRoot.setPrefSize(40,90);
        clear.setPrefSize(38,28);
        delete.setPrefSize(38,28);
        equals.setPrefSize(90,40);
        decimalToggle.setPrefSize(90,40);
        decimalToggle.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
        quaternaryToggle.setPrefSize(100,40);
        quaternaryToggle.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
        Button[] operationButtonSet = {plus, minus, multiply, divide, squareRoot, nRoot};
        for(int i=0; i<=operationButtonSet.length-1; i++){
            Button button = operationButtonSet[i];
            button.setPrefSize(30,80);
        }
        Button[] digitButtonSet = {zero, one, two, three};
        for(int i=0; i<=digitButtonSet.length-1; i++){
            Button button = digitButtonSet[i];
            button.setPrefSize(30,90);
        }
        inputAreaQuaternary.setPrefSize(180, 30);
        inputAreaQuaternary.setEditable(false);
        outputToggleArea.setPrefSize(200,400);
        outputToggleArea.setEditable(false);
        outputToggleArea.setWrapText(true);
    }

}
