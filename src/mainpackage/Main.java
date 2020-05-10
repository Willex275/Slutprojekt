package mainpackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Slutprojekt");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
        primaryStage.setResizable(false);

    }




    public String[][] Questions =

            {{"Who was the person behind microsoft?", "Bill Gates", "Steve Jobs", "Drake", "Donald Trump"},

                    {"When was the eiffel tower built?", "1887", "1825", "1765", "1990"},

                    {"When did Donald Trump become president?", "2016", "2020", "2002", "1876"},

                    {"When did 9/11 take place?", "2001", "1901", "2002", "2023"}};



    TextField text = new TextField();

    Button a = new Button();

    Button b = new Button();

    Button c = new Button();

    Button d = new Button();

    char correct;

    boolean active;









    public static void main(String[] args) {
        launch(args);
    }
}
