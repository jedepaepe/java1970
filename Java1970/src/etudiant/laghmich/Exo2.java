/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.laghmich;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Exo2 extends Application {

    int radius = 50;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Circle c1 = new Circle();   // #prof# mieux avec   // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        c1.setCenterX(100);         // #prof# inutile avec un StackPane
        c1.setCenterY(100);
        c1.setRadius(50);
        c1.setFill(Color.AQUA);

        Circle c2 = new Circle();
        c2.setCenterX(100);
        c2.setCenterY(100);
        c2.setRadius(40);
        c2.setFill(Color.PINK);

        Circle c3 = new Circle();
        c3.setCenterX(100);
        c3.setCenterY(100);
        c3.setRadius(30);
        c3.setFill(Color.AQUA);

        Circle c4 = new Circle();
        c4.setCenterX(100);
        c4.setCenterY(100);
        c4.setRadius(20);
        c4.setFill(Color.PINK);

        Circle c5 = new Circle();
        c5.setCenterX(100);
        c5.setCenterY(100);
        c5.setRadius(10);
        c5.setFill(Color.AQUA);

        Button btnLeft = new Button();
        btnLeft.setText("REDUIRE");
        btnLeft.setLayoutX(20); // #prof# inutlise avec le HBox
        btnLeft.setLayoutY(20);
        btnLeft.setOnAction((ActionEvent actionEvent) -> {
            c1.setRadius(radius * 1.1);
            radius -= 10;
            // #prof# et les autres cercles?
        });

        Button btnRight = new Button();
        btnRight.setText("AGRANDIR");
        btnRight.setLayoutX(15);
        btnRight.setLayoutY(200);
        btnRight.setOnAction((ActionEvent actionEvent) -> {
            c1.setRadius(radius * 1.1);
            radius += 10;
            // #prof# et les autres cercles?
        });

        StackPane pa = new StackPane(c1, c2, c3, c4, c5);
        BorderPane bp = new BorderPane(pa);
        bp.setBottom(btnLeft);  // #prof# les deux boutons doivent être en-dessous
        bp.setTop(btnRight);
        btnLeft.setMaxWidth(Double.MAX_VALUE);  // #prof# les boutons ne doivent pas occuper tout l'espace
        btnRight.setMaxWidth(Double.MAX_VALUE);

        pa.setStyle("-fx-border-color: black; -fx-background-color: white; -fx-border-radius: 20;");    // #prof# manque la marge
        Scene scene = new Scene(bp, 300, 250);
        primaryStage.setTitle("Circles game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*public void CreateCircle(Circle circleName, Color c){
       
        circleName = new Circle();
        circleName.setCenterX(100);
        circleName.setCenterY(100);
        circleName.setRadius(50);
        circleName.setFill(c);
    }*/
}
