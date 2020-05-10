package mainpackage; // antekningarna som strå i programet kan vara väldigt oformulerade men dem finns där så att jag ska komma ihåg vad som behövs göras!



import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Main extends Application{


    // String arrayen med frågor // ska bara ha anteckningarna så att jag kommer ihåg senare
    public String[][] Questions =

            {{"Who was the person behind microsoft?", "Bill Gates", "Steve Jobs", "Drake", "Donald Trump"},

                    {"When was the eiffel tower built?", "1887", "1825", "1765", "1990"},

                    {"When did Donald Trump become president?", "2016", "2020", "2002", "1876"},

                    {"When did 9/11 take place?", "2001", "1901", "2002", "2023"}};


    // button maker // function Button With char and boolean!
    TextField text = new TextField();

    Button a = new Button();

    Button b = new Button();

    Button c = new Button();

    Button d = new Button();

    char correct;

    boolean active;





    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();

        Scene scene = new Scene(root,1000,300,Color.BLACK);

        primaryStage.setScene(scene);

        primaryStage.show();





        root.getChildren().add(text);

        text.setEditable(false);

        text.setMinSize(1000, 100);

        text.setFont(Font.font("Verdana", FontWeight.BOLD, 12));



        a.setMinWidth(250);

        a.setMinHeight(200);

        a.setTranslateY(100);

        a.setTranslateX(0);

        root.getChildren().add(a);


        b.setMinWidth(250);

        b.setMinHeight(200);

        b.setTranslateY(100);

        b.setTranslateX(250);

        root.getChildren().add(b);





        c.setMinWidth(250);

        c.setMinHeight(200);

        c.setTranslateY(100);

        c.setTranslateX(500);

        root.getChildren().add(c);





        d.setMinWidth(250);

        d.setMinHeight(200);

        d.setTranslateY(100);

        d.setTranslateX(750);

        root.getChildren().add(d);





        reset();

        a.setOnAction(e -> guess('a'));

        b.setOnAction(e -> guess('b'));

        c.setOnAction(e -> guess('c'));

        d.setOnAction(e -> guess('d'));













    }







    public static void main(String[] args) {

        launch();

    }



}