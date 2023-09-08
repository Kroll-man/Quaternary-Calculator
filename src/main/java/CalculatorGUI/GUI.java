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
    static TextArea displayAreaSecondary = new TextArea();
    static TextArea displayAreaPrimary = new TextArea();
    static Button zero = new Button("0");
    static Button one = new Button("1");
    static Button two = new Button("2");
    static Button three = new Button("3");
    static Button plus = new Button("+");
    static Button minus = new Button("-");
    static Button divide = new Button("÷");
    static Button multiply = new Button("x");
    static Button squareRoot = new Button("√");
    static Button square = new Button("^2");
    static Button displayToggle = new Button("DEC/QUAT");
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
        stage.setScene(new Scene(new VBox(setupGridPaneAlignment()), 550,550, Paint.valueOf("#add8e6")));
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
        calculatorRoot.add(displayAreaSecondary, 6, 0, 3, 1);
        calculatorRoot.add(displayAreaPrimary, 0, 1, 10, 2);

        //digit buttons
        calculatorRoot.add(zero, 0, 3, 3, 3);
        calculatorRoot.add(one, 3, 3, 3, 3);
        calculatorRoot.add(two, 0, 6, 3, 3);
        calculatorRoot.add(three, 3, 6, 3, 3);

        //operation buttons
        calculatorRoot.add(plus, 6, 5, 2, 2);
        calculatorRoot.add(minus, 8, 5, 2, 2);
        calculatorRoot.add(multiply, 6, 7, 2, 2);
        calculatorRoot.add(divide, 8, 7, 2, 2);
        calculatorRoot.add(squareRoot, 6, 9, 2, 2);
        calculatorRoot.add(square, 8, 9, 2, 2);

        //control buttons
        calculatorRoot.add(clear, 6, 3, 2, 2);
        calculatorRoot.add(delete, 8, 3, 2, 2);
        calculatorRoot.add(displayToggle, 0, 9, 2, 2);
        calculatorRoot.add(equals, 2, 9, 4, 2);



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
        square.setFont(Font.font("Verdana", FontWeight.BOLD, 9));
        equals.setPrefSize(190,90);
        displayToggle.setPrefSize(90,90);
        clear.setPrefSize(90,90);
        delete.setPrefSize(90,90);
        displayToggle.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
        Button[] operationButtonSet = {plus, minus, multiply, divide, squareRoot, square};
        for(int i=0; i<=operationButtonSet.length-1; i++){
            Button button = operationButtonSet[i];
            button.setPrefSize(90,90);
        }
        Button[] digitButtonSet = {zero, one, two, three};
        for(int i=0; i<=digitButtonSet.length-1; i++){
            Button button = digitButtonSet[i];
            button.setPrefSize(140,140);
        }
        displayAreaPrimary.setPrefSize(490, 40);
        displayAreaPrimary.setEditable(false);
        displayAreaSecondary.setPrefSize(140, 40);
        displayAreaSecondary.setEditable(false);
    }
}
