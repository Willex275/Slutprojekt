package mainpackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.text.View;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Slutprojekt");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
