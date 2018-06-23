/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.rousseau;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class exJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane();

        //stackpane
        Circle circle1 = new Circle();  // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        circle1.setRadius(50.0f);
        circle1.setFill(Color.AQUA);
        Circle circle2 = new Circle();
        circle2.setRadius(40.0f);
        circle2.setFill(Color.PINK);
        Circle circle3 = new Circle();
        circle3.setRadius(30.0f);
        circle3.setFill(Color.AQUA);
        Circle circle4 = new Circle();
        circle4.setRadius(20.0f);
        circle4.setFill(Color.PINK);
        Circle circle5 = new Circle();
        circle5.setRadius(10.0f);
        circle5.setFill(Color.AQUA);

        Pane pane = new Pane(circle1, circle2, circle3, circle4, circle5);  // #prof# mieux avec un StackPane
        circle1.centerXProperty().bind(pane.widthProperty().divide(2)); // #prof# pas nécessaire avec un StackPane
        circle1.centerYProperty().bind(pane.heightProperty().divide(2));
        circle2.centerXProperty().bind(pane.widthProperty().divide(2));
        circle2.centerYProperty().bind(pane.heightProperty().divide(2));
        circle3.centerXProperty().bind(pane.widthProperty().divide(2));
        circle3.centerYProperty().bind(pane.heightProperty().divide(2));
        circle4.centerXProperty().bind(pane.widthProperty().divide(2));
        circle4.centerYProperty().bind(pane.heightProperty().divide(2));
        circle5.centerXProperty().bind(pane.widthProperty().divide(2));
        circle5.centerYProperty().bind(pane.heightProperty().divide(2));
        root.setTop(pane);  // #prof# plus logique root.setCenter(pane.setCenter(...)
        pane.setStyle("-fx-border-color: black");
        BorderPane.setAlignment(pane, Pos.CENTER);  // #prof# pas nécessaire

        root.setPadding(new Insets(15, 20, 10, 10));
        Button btn1 = new Button("Agrandir");
        btn1.setPadding(new Insets(5, 5, 5, 5));
        root.setLeft(btn1);     // #prof# en bas => HBox
        BorderPane.setAlignment(btn1, Pos.CENTER);  // #prof# pas nécessaire
        BorderPane.setMargin(btn1, new Insets(10, 10, 10, 10));
        Button btn2 = new Button("Réduire");
        btn2.setPadding(new Insets(5, 5, 5, 5));
        root.setRight(btn2);
        BorderPane.setMargin(btn2, new Insets(10, 10, 10, 10));
        BorderPane.setAlignment(btn2, Pos.CENTER);  // #prof# pas nécessaire

        btn1.setOnAction((ActionEvent event) -> { //agrandir #prof# agrandit qu'une fois
            circle1.setRadius(55.0f);   // #prof# circle1.setRadius(circle1.getRadius() * 1.1)
            circle2.setRadius(44.0f);
            circle3.setRadius(33.0f);
            circle4.setRadius(22.0f);
            circle5.setRadius(11.0f);
        });

        btn2.setOnAction((ActionEvent event) -> { //réduire #prof# réduit qu'une fois
            circle1.setRadius(45.0f);   // #prof# circle1.setRadius(circle1.getRadius() * 0.9)
            circle2.setRadius(36.0f);
            circle3.setRadius(27.0f);
            circle4.setRadius(18.0f);
            circle5.setRadius(9.0f);
        });
             
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.setTitle("Drawing Circles");
        stage.show();

    }
}
