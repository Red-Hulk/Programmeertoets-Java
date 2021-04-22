package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.screens.MainScreen;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Beginnen bij mainscene
        new MainScreen(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
