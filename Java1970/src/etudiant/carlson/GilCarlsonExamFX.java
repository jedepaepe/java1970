/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.carlson;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 0504gicarlson
 */
public class GilCarlsonExamFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Circles in top box :
        Circle biggestCircle = new Circle(50, Color.AZURE); // #prof# plus élégant:   // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        Circle bigCircle = new Circle(40, Color.PINK);
        Circle mediumCircle = new Circle(30, Color.AZURE);
        Circle smallCircle = new Circle(20, Color.PINK);
        Circle smallestCircle = new Circle(10, Color.AZURE);
        Circle[] circles = {biggestCircle, bigCircle, mediumCircle, smallCircle, smallestCircle};
        StackPane circleStack = new StackPane(biggestCircle, bigCircle, mediumCircle, smallCircle, smallestCircle); // #prof# StackPane(circles)
        circleStack.setMinSize(200, 200);
        
        // Buttons in lower box :
        Button increaseBtn = new Button("Agrandir");
        increaseBtn.setOnAction((ActionEvent event) -> {
            for (Circle circle : circles) {
                double radius = circle.getRadius();
                radius = radius * 1.1;
                circle.setRadius(radius);
            }
        });
        Button decreaseBtn = new Button("Réduire");
        decreaseBtn.setOnAction((ActionEvent event) -> {
            for (Circle circle : circles) {
                double radius = circle.getRadius();
                radius = radius * 0.9;
                circle.setRadius(radius);
            }
        });
        //Styling :
        circleStack.setStyle("-fx-border-style: solid inside;"
                + "-fx-border-radius: 20;");
        HBox commands = new HBox(increaseBtn, decreaseBtn);
        commands.setAlignment(Pos.CENTER);
        commands.setStyle("-fx-padding: 10;"
                + "-fx-spacing: 10;"
                + "-fx-border-style: solid inside;"
                + "-fx-border-radius: 20;"
        );
        BorderPane root = new BorderPane(circleStack);
        root.setMargin(commands, new Insets(0, 10, 10, 10));    // #prof# pouvait être ajouté via setStyle "-fx-border-insets: 10;
        root.setMargin(circleStack, new Insets(10, 10, 10, 10));    // #prof# bonne pratique : accédé aux méthodes statiques via la classe => BorderPane.setMargin(...)
        root.setBottom(commands);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        // #prof# oubli du titre
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
