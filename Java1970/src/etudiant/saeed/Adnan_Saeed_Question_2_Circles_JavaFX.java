/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.saeed;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;   // #prof# unused import
import javafx.event.EventType;   // #prof# unused import
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;   // #prof# unused import
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;   // #prof# unused import
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 1810adsaeed
 */
public class Adnan_Saeed_Question_2_Circles_JavaFX extends Application {    // #prof# don't respect convention for name of class => AdnanSaeedQuestion2CirclesJavaFX & too long name

    int radius = 10;

    public void setRadius(int radius) { // #prof# no use
        this.radius = radius;
    }

    @Override
    public void start(Stage primaryStage) {

        Button enlarge = new Button();  // #prof# better: = new Button("enlarge")
        Button decrease = new Button();

          // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        Circle circle1 = new Circle(150, 150, (radius * 5), Color.BLUE);    // #prof# position not necessary with StackPane
        Circle circle2 = new Circle(150, 150, (radius * 4), Color.PINK);
        Circle circle3 = new Circle(150, 150, (radius * 3), Color.BLUE);
        Circle circle4 = new Circle(150, 150, (radius * 2), Color.PINK);
        Circle circle5 = new Circle(150, 150, (radius * 1), Color.BLUE);
        StackPane p = new StackPane();  // #prof# more simple new StackPane(circle1, circle2, circle...);
                                        // #prof# too short name "p" => StackPane stackPane
        p.getChildren().add(circle1);
        p.getChildren().add(circle2);
        p.getChildren().add(circle3);
        p.getChildren().add(circle4);
        p.getChildren().add(circle5);
        p.setAlignment(Pos.CENTER); // #prof# useless : automatic with StackPane
        HBox hbox2 = new HBox(p);
        hbox2.setAlignment(Pos.CENTER);
        hbox2.setPadding(new Insets(15, 15, 15, 15));
      //  p.setAlignment(Pos.CENTER);

        HBox hbox1 = new HBox(10, enlarge, decrease);   // #prof# only one HBox is necessary
        hbox1.setPadding(new Insets(15, 15, 15, 15));
        hbox1.setAlignment(Pos.BOTTOM_CENTER);

        enlarge.setText("Enlarge"); // #prof# disorder in the code, should put it after creation
        decrease.setText("Decrease");

        VBox v1 = new VBox(hbox2, hbox1);   // #prof# it gives an incorrect behavior : buttons are not at the button => use BorderPane for that
        
        // #prof# too much space 
        enlarge.setOnAction((ActionEvent event) -> {
            setRadius((int) (radius * 1.1));    // #prof# useless: you change an internal variable, if you this design you have to bind the radius of each Circle to this variable
           //Sorry Ran out of time to edit code
            System.out.println("Enlarged");
            });

        decrease.setOnAction((ActionEvent event) -> {
            setRadius((int) (radius * 0.9));    // #prof# idem
            //Sorry Ran out of time to edit code
            System.out.println("Decreased");

        });

        BorderPane root = new BorderPane(); // #prof# not use
    
        // #prof# too much space
        Scene scene = new Scene(v1, 300, 300);

        // #prof# too much space
        primaryStage.setScene(scene);
        primaryStage.show();
        // #prof# too much space
        
       
    }

    // #prof# too much space
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
