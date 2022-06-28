package com;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static final Color SPOT_COLOR_WHITE = Color.valueOf("FFE8D6");
    public static final Color SPOT_COLOR_BLACK = Color.valueOf("CB997E");
    public static final int SPOT_SIZE = 80;

    @Override
    public void start(Stage primaryStage) throws Exception{



        Board root = new Board();

        primaryStage.setTitle("Chess v1.0");
        primaryStage.setScene(new Scene(root, SPOT_SIZE*8, SPOT_SIZE*8));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
