/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.verbist;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ExamenFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FX EXAM");
        Group root = new Group();   // #prof# pas très utile
        Scene scene = new Scene(root, 550, 250, Color.ALICEBLUE);

        Circle c1 = new Circle();  // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        c1.setCenterX(100);
        c1.setCenterY(100);
        c1.setRadius(50);
        c1.setFill((Color.AQUAMARINE));
        c1.setStrokeWidth(20);

        Circle c2 = new Circle();
        c2.setCenterX(100);
        c2.setCenterY(100);
        c2.setRadius(40);
        c2.setFill(Color.ROSYBROWN);
        c2.setStrokeWidth(20);

        Circle c3 = new Circle();
        c3.setCenterX(100);
        c3.setCenterY(100);
        c3.setRadius(30);
        c3.setFill(Color.AQUAMARINE);
        c3.setStrokeWidth(20);

        Circle c4 = new Circle();
        c4.setCenterX(100);
        c4.setCenterY(100);
        c4.setRadius(20);
        c4.setFill(Color.ROSYBROWN);
        c4.setStrokeWidth(20);

        Circle c5 = new Circle();
        c5.setCenterX(100);
        c5.setCenterY(100);
        c5.setRadius(10);
        c5.setFill(Color.AQUAMARINE);
        c5.setStrokeWidth(20);

        Button b1 = new Button("Reduire");
        HBox hbox = new HBox(b1);
        b1.setAlignment(Pos.TOP_LEFT);  // #prof# inutile
        b1.setOnAction((javafx.event.ActionEvent event) -> {
            System.out.println("!");
        });

        Button b2 = new Button("Grandir");
        b2.setAlignment(Pos.TOP_RIGHT); // #prof# inutile
        b2.setOnAction((javafx.event.ActionEvent event) -> {
            System.out.println("!");

        }); 

        root.getChildren().add(c1);
        root.getChildren().add(c2);
        root.getChildren().add(c3);
        root.getChildren().add(c4);
        root.getChildren().add(c5);

        root.getChildren().add(b1);
        root.getChildren().add(b2);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
