/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.carvalho;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;      // #prof# pas utilisé 
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;      // #prof# pas utilisé 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;      // #prof# pas utilisé 
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 1310jocarvalho
 */
public class QuestionJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Crée l'objet circle:Circle
        Circle circle1 = new Circle();  // #prof" plus élégant : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ..
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();

        // Ajuste les propriétés du cercle
        circle1.setRadius(50);
        circle1.setFill(Color.AQUA);
        // #prof# trop d'espaces 

        circle2.setRadius(40);
        circle2.setFill(Color.PINK);
      

        circle3.setRadius(30);
        circle3.setFill(Color.AQUA);
       
// #prof# trop d'espace 
        circle4.setRadius(20);
        circle4.setFill(Color.PINK);
        

        circle5.setRadius(10);
        circle5.setFill(Color.AQUA);
        
        // largeur de la bordure

        Button btn1 = new Button();
        btn1.setText("Agrandir");

        btn1.setOnAction(new EventHandler<ActionEvent>() { // #prof# plus élégant avec des fonctions lambda

            @Override
            public void handle(ActionEvent event) {

                circle1.setRadius(50 * 1.1);    // #prof# n'agrandit qu'une seule fois : circle1.setRadius(circle1.getRadius() * 1.1)
                circle2.setRadius(40 * 1.1);
                circle3.setRadius(30 * 1.1);
                circle4.setRadius(20 * 1.1);
                circle5.setRadius(10 * 1.1);

            }
        });

        Button btn2 = new Button();
        btn2.setText("Reduire");

        btn2.setOnAction(new EventHandler<ActionEvent>() {  // #prof# plus élégant avec des fonctions lambda

            @Override
            public void handle(ActionEvent event) {

               
                circle1.setRadius(50 * 0.9);    // #prof ne réduit qu'une seule fois, idem
                circle2.setRadius(40 * 0.9);
                circle3.setRadius(30 * 0.9);
                circle4.setRadius(20 * 0.9);
                circle5.setRadius(10 * 0.9);
            }
        });

        // Crée un Pane et ajoute circle à ce Pane
        StackPane pane1 = new StackPane(circle1, circle2, circle3, circle4, circle5);
        pane1.setAlignment(Pos.CENTER); // #prof# inutile, StackPane positionne au centre

        pane1.setStyle("-fx-padding: 10;"
                + "-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: black;");

        HBox pane2 = new HBox(btn1, btn2);

        pane2.setSpacing(10);
        pane2.setAlignment(Pos.CENTER);
        pane2.setStyle("-fx-padding: 10;"
                + "-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: black;");

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(pane1);   // #prof# => borderPane.setCenter(pane1);
        borderPane.setBottom(pane2);

        // Crée l'objet scene:Scene
        Scene scene = new Scene(borderPane);

        // Ajoute la scène (scene:Scene) à la fenêtre (stage:Stage)
        primaryStage.setScene(scene);

        // Donne un titre à la fenêtre
        primaryStage.setTitle("Question Java FX");

        // Affiche la fenêtre à l'écran
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
