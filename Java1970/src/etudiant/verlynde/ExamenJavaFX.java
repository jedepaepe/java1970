/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.verlynde;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ExamenJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        int size = 300;
        Circle c1 = new Circle(50, Color.PINK);  // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        Circle c2 = new Circle(40, Color.AQUA);
        Circle c3 = new Circle(30, Color.PINK);
        Circle c4 = new Circle(20, Color.AQUA);
        Circle c5 = new Circle(10, Color.PINK);
        Pane cercles = new Pane(c1, c2, c3, c4, c5);    // #prof# mieux avec un StackPane
        c1.centerXProperty().bind(cercles.widthProperty().divide(2));   // #prof# car ceci n'est pas nécessaire avec un StackPane
        c1.centerYProperty().bind(cercles.heightProperty().divide(2));
        c2.centerXProperty().bind(cercles.widthProperty().divide(2));
        c2.centerYProperty().bind(cercles.heightProperty().divide(2));
        c3.centerXProperty().bind(cercles.widthProperty().divide(2));
        c3.centerYProperty().bind(cercles.heightProperty().divide(2));
        c4.centerXProperty().bind(cercles.widthProperty().divide(2));
        c4.centerYProperty().bind(cercles.heightProperty().divide(2));
        c5.centerXProperty().bind(cercles.widthProperty().divide(2));
        c5.centerYProperty().bind(cercles.heightProperty().divide(2));
        cercles.setStyle("-fx-padding: 10;"
                + "-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;");
        Button reduire = new Button();  // #prof# mieux new Button("Réduire")
        reduire.setText("Réduire");
        reduire.setOnAction(new EventHandler<ActionEvent>() {   // #prof# mieux avec une Lambda
            @Override
            public void handle(ActionEvent event) {
                if (c1.getRadius() < size / 10) {   // #prof# non demandé mais pourquoi pas
                } else {
                    c1.setRadius(c1.getRadius() * 0.9);
                    c2.setRadius(c2.getRadius() * 0.9);
                    c3.setRadius(c3.getRadius() * 0.9);
                    c4.setRadius(c4.getRadius() * 0.9);
                    c5.setRadius(c5.getRadius() * 0.9);
                }
            }
        });
        Button agrandir = new Button(); // #prof# idem
        agrandir.setText("Agrandir");
        agrandir.setOnAction(new EventHandler<ActionEvent>() { // #prof# idem
            @Override
            public void handle(ActionEvent event) {
                if (c1.getRadius() > ((size / 2) - 50)) {
                } else {
                    c1.setRadius(c1.getRadius() * 1.1);
                    c2.setRadius(c2.getRadius() * 1.1);
                    c3.setRadius(c3.getRadius() * 1.1);
                    c4.setRadius(c4.getRadius() * 1.1);
                    c5.setRadius(c5.getRadius() * 1.1);
                }
            }
        });
        TilePane boutons = new TilePane(Orientation.HORIZONTAL); // #prof# mieux : new TilePane(Orientation.HORIZONTAL, reduire, agrandir)
        boutons.setStyle("-fx-padding: 10;"
                + "-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 10;");
        boutons.getChildren().add(reduire);
        boutons.getChildren().add(agrandir);
        boutons.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setCenter(cercles);
        pane.setBottom(boutons);
        Scene scene = new Scene(pane, size, size);
        primaryStage.setTitle("Examen Java");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
