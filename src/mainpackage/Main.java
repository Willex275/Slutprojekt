package mainpackage; // antekningarna som står i programet kan vara väldigt oformulerade men dem finns där så att jag ska komma ihåg vad som behövs göras och kopplas med varandra!

import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import static javafx.scene.paint.Color.*;


public class Main extends Application{


    // String arrayen med frågor // ska bara ha anteckningarna så att jag kommer ihåg senare
    // programet är utformat att man kan lägga till frågor men behöver definera nya knappar i programet
    public  String[][] Questions =

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

        Scene scene = new Scene(root,990,540, BLACK);

        primaryStage.setResizable(false);

        primaryStage.setScene(scene);

        primaryStage.show();





        root.getChildren().add(text);

        text.setEditable(false);

        text.setMinSize(1000, 250);

        text.alignmentProperty();

        text.setFont(Font.font("SansSerif", FontWeight.BLACK,  30));

        // deffinerar knapparnas layout Size X samt y led.
        a.setMinWidth(250);

        a.setMinHeight(300);

        a.setTranslateY(250);

        a.setTranslateX(0);

        a.setFont(Font.font("SansSerif",FontWeight.BLACK, 20));

        root.getChildren().add(a);


        b.setMinWidth(250);

        b.setMinHeight(300);

        b.setTranslateY(250);

        b.setTranslateX(250);

        b.setFont(Font.font("SansSerif",FontWeight.BLACK, 20));

        root.getChildren().add(b);

        c.setMinWidth(250);

        c.setMinHeight(300);

        c.setTranslateY(250);

        c.setTranslateX(500);

        c.setFont(Font.font("SansSerif",FontWeight.BLACK, 20));

        root.getChildren().add(c);

        d.setMinWidth(250);

        d.setMinHeight(300);

        d.setTranslateY(250);

        d.setTranslateX(750);

        d.setFont(Font.font("SansSerif",FontWeight.BLACK, 20));

        root.getChildren().add(d);

        reset();

        a.setOnAction(e -> guess('a'));

        b.setOnAction(e -> guess('b'));

        c.setOnAction(e -> guess('c'));

        d.setOnAction(e -> guess('d'));



    }



    public void reset() {

        Random rd = new Random();

        int QUT = rd.nextInt(4-0)+0;

        active = true;

        correct = ' ';

        text.setText(Questions[QUT][0]);



        ArrayList<Integer> alternatives = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {

            alternatives.add(i);

        }



        int index = rd.nextInt(alternatives.size())+0;

        a.setText(Questions[QUT][alternatives.get(index) + 1]);

        if (index == 0 && correct == ' ') {

            correct = 'a';

        }

        alternatives.remove(index);


        index = rd.nextInt(alternatives.size())+0;

        b.setText(Questions[QUT][alternatives.get(index) + 1]);

        if (index == 0 && correct == ' ') {

            correct = 'b';

        }

        alternatives.remove(index);

        index = rd.nextInt(alternatives.size())+0;

        c.setText(Questions[QUT][alternatives.get(index) + 1]);

        if (index == 0 && correct == ' ') {

            correct = 'c';

        }

        alternatives.remove(index);



        index = rd.nextInt(alternatives.size())+0;

        d.setText(Questions[QUT][alternatives.get(index)+ 1]);

        if (index == 0 && correct == ' ') {

            correct = 'd';

        }



    }
        // centralen rätt/fel definerat Questions
    public void guess(char c) {

        if (active) {

            if (c == correct ) {

                text.setText("Right! Click on one of the buttons to get next question");

                active = false;

            } else {

                text.setText("Wrong! Click on one of buttons to get next question");

                active = false;

            }

        } else {

            reset();

        }


    }



    // startar Programet
    public static void main(String[] args) {

        launch();

    }



}