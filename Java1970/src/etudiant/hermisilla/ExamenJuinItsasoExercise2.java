/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.hermisilla;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;   // #prof# pas utilisé 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ExamenJuinItsasoExercise2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Circle circle1 = new Circle();  // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();
        circle1.setRadius(50);
        circle2.setRadius(40);
        circle3.setRadius(30);
        circle4.setRadius(20);
        circle5.setRadius(10);
        circle1.setFill(Color.AQUA);
        circle2.setFill(Color.PINK);
        circle3.setFill(Color.AQUA);
        circle4.setFill(Color.PINK);
        circle5.setFill(Color.AQUA);// couleur de remplissage

        Button button1 = new Button("Agrandir");
        Button button2 = new Button("Reduire");

        button1.setOnAction((ActionEvent event) -> {
            circle1.setRadius(circle1.getRadius() + 10);
            circle2.setRadius(circle2.getRadius() + 10);
            circle3.setRadius(circle3.getRadius() + 10);
            circle4.setRadius(circle4.getRadius() + 10);
            circle5.setRadius(circle5.getRadius() + 10);
        });
        button2.setOnAction((ActionEvent event) -> {
            circle1.setRadius(circle1.getRadius() - 10);
            circle2.setRadius(circle2.getRadius() - 10);
            circle3.setRadius(circle3.getRadius() - 10);
            circle4.setRadius(circle4.getRadius() - 10);
            circle5.setRadius(circle5.getRadius() - 10);
        });
        HBox hbox = new HBox(10, button1, button2);
        hbox.setSpacing(300);
        hbox.setStyle("-fx-padding: 10;"
                + "-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 15;"
                + "-fx-border-color: grey;");

        Pane pane = new Pane(circle1, circle2, circle3, circle4, circle5, hbox);
        Scene scene = new Scene(pane, 600, 300);

        circle1.centerXProperty().bind(pane.widthProperty().divide(2)); // joli, mais il était plus simple d'utiliser le StackPane
        circle1.centerYProperty().bind(pane.heightProperty().divide(2));
        circle2.centerXProperty().bind(pane.widthProperty().divide(2));
        circle2.centerYProperty().bind(pane.heightProperty().divide(2));
        circle3.centerXProperty().bind(pane.widthProperty().divide(2));
        circle3.centerYProperty().bind(pane.heightProperty().divide(2));
        circle4.centerXProperty().bind(pane.widthProperty().divide(2));
        circle4.centerYProperty().bind(pane.heightProperty().divide(2));
        circle5.centerXProperty().bind(pane.widthProperty().divide(2));
        circle5.centerYProperty().bind(pane.heightProperty().divide(2));

        stage.setScene(scene);
        stage.setTitle("Exercise2");
        stage.show();
    }
}
