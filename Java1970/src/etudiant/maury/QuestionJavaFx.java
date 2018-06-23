/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.maury;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;    // #prof# non utilisé 
import javafx.event.EventHandler;   // #prof# non utilisé 
import javafx.geometry.Pos;
import javafx.scene.Group;          // #prof# non utilisé 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;    // #prof# non utilisé 
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;    // #prof# non utilisé 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 3101etmaury
 */
public class QuestionJavaFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Circle c50 = new Circle();  // #prof# mieux   // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        c50.setRadius(50.0f);
        c50.setFill(Color.AQUA);

        Circle c40 = new Circle();
        c40.setRadius(40.0f);
        c40.setFill(Color.PINK);

        Circle c30 = new Circle();
        c30.setRadius(30.0f);
        c30.setFill(Color.AQUA);

        Circle c20 = new Circle();
        c20.setRadius(20.0f);
        c20.setFill(Color.PINK);

        Circle c10 = new Circle();
        c10.setRadius(10.0f);
        c10.setFill(Color.AQUA);

        Button bgauche = new Button("réduire");
        bgauche.setOnMouseClicked((MouseEvent t) -> {
            c10.setRadius(c10.getRadius() * 0.9);
            c20.setRadius(c10.getRadius() * 0.9);   // #prof# erreur => c20.setRadius(c20.getRadius() * 0.9);
            c30.setRadius(c10.getRadius() * 0.9);   // #prof# idem ...
            c40.setRadius(c10.getRadius() * 0.9);
            c50.setRadius(c10.getRadius() * 0.9);

        });
        bgauche.setStyle("-fx-border-radius: 30;");

        Button bdroit = new Button("agrandir");
        bdroit.setOnMouseClicked((t) -> {
            c10.setRadius(c10.getRadius() * 1.1);
            c20.setRadius(c10.getRadius() * 1.1);   // #prof# erreur => c20.setRadius(c20.getRadius() * 1.1);
            c30.setRadius(c10.getRadius() * 1.1);   // #prof# idem ...
            c40.setRadius(c10.getRadius() * 1.1);
            c50.setRadius(c10.getRadius() * 1.1);
        });
        bdroit.setStyle("-fx-border-radius: 30;");

//        Group root = new Group();
//        root.getChildren().add(c50);
//        root.getChildren().add(c40);
//        root.getChildren().add(c30);
//        root.getChildren().add(c20);
//        root.getChildren().add(c10);
        
        

        HBox hbox = new HBox(bgauche, bdroit);
        BorderPane bord = new BorderPane(hbox); // #prof# pas utilisé 
        StackPane pane = new StackPane(c50,c40,c30,c20,c10);
        pane.setStyle("-fx-border-radius: 30;");

        hbox.setAlignment(Pos.CENTER);
        hbox.setStyle("-fx-border-radius: 30;");
        c10.centerXProperty().bind(pane.widthProperty().divide(2)); // #prof# pas nécessaire avec un StackPane
        c10.centerYProperty().bind(pane.heightProperty().divide(2));    // #prof# idem
        c10.radiusProperty().bind(pane.widthProperty().divide(4));  // #prof# erreur : ce code cause le problème : tous les cercles ont la même taille

        c20.centerXProperty().bind(pane.widthProperty().divide(2)); // #prof# idem
        c20.centerYProperty().bind(pane.heightProperty().divide(2));
        c20.radiusProperty().bind(pane.widthProperty().divide(4));

        c30.centerXProperty().bind(pane.widthProperty().divide(2));
        c30.centerYProperty().bind(pane.heightProperty().divide(2));
        c30.radiusProperty().bind(pane.widthProperty().divide(4));

        c40.centerXProperty().bind(pane.widthProperty().divide(2));
        c40.centerYProperty().bind(pane.heightProperty().divide(2));
        c40.radiusProperty().bind(pane.widthProperty().divide(4));

        c50.centerXProperty().bind(pane.widthProperty().divide(2));
        c50.centerYProperty().bind(pane.heightProperty().divide(2));
        c50.radiusProperty().bind(pane.widthProperty().divide(4));

        // #prof# manque le positionnement dans le BorderPane
        // #prof# bord.setCenter(pane);
        // #prof# bord.setBottom(hbox);
        // #prof# Scene scene = new Scene(bord);
        Scene scene;
        scene = new Scene(pane);

        stage.setScene(scene);

        stage.setTitle("5 Cercles");

        stage.show();
    }

//    public void setPosition(Circle c, Pane pane) {
//
//        c.centerXProperty().bind(pane.widthProperty().divide(2));
//        c.centerYProperty().bind(pane.heightProperty().divide(2));
//        c.radiusProperty().bind(pane.widthProperty().divide(4));
//    }
}
