package CalculatorGUI;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        configureWindow(primaryStage);
    }

    private void configureWindow(Stage stage) {
        Scene scene = new Scene(new VBox(), 400, 600);

        stage.setTitle("Cardinal Trivia - Board");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

}
