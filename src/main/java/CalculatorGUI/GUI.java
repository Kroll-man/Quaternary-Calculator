package CalculatorGUI;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.awt.*;
import static java.awt.Label.CENTER;
public class GUI extends Application {
    Label calculatorTitle = new Label("Quaternary Calculator I", CENTER);
    TextArea inputAreaQuaternary = new TextArea();
    TextArea outputToggleArea = new TextArea();
    Button zero = new Button("0");
    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button plus = new Button("+");
    Button minus = new Button("-");
    Button divide = new Button("÷");
    Button multiply = new Button("x");
    Button squareRoot = new Button("√");
    Button nRoot = new Button("n*√");
    Button decimalToggle = new Button("DECIMAL");
    Button quaternaryToggle = new Button("QUATERNARY");
    Button clear = new Button("CLR");
    Button delete = new Button("DEL");
    Button equals = new Button("=");
    public static void main(String[] args) throws Exception{
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        configureWindow(primaryStage);
    }

    //building GUI Calculator structure:
    private void configureWindow(Stage stage) {
        calculatorTitle.setBounds(0,3, 600, 50);
        calculatorTitle.setBackground(Color.lightGray);
        Scene scene = new Scene(new VBox(setupGridPaneAlignment()), 600, 500);
        stage.setTitle("CS 495 Group 6 ~ Quaternary Calculator");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
    private GridPane setupGridPaneAlignment() {
        GridPane calculatorRoot = new GridPane();
        calculatorRoot.setAlignment(Pos.CENTER);
        calculatorRoot.setHgap(10);
        calculatorRoot.setVgap(10);
        //input & output text areas
        calculatorRoot.add(inputAreaQuaternary, 1,0,7,1);
        calculatorRoot.add(outputToggleArea, 13,0,8,14);
        //delete and clear buttons
        calculatorRoot.add(delete,9,1,2,1);
        calculatorRoot.add(clear, 11, 1, 2, 1);
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
        calculatorRoot.add(decimalToggle,14,14,4,1);
        calculatorRoot.add(quaternaryToggle, 18,14,6,1);
        setControlProperties();
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
