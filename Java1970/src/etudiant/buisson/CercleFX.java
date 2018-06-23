/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.buisson;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 0806anbuisson
 */
public class CercleFX extends Application {

    GridPane gridPane = new GridPane();     // #prof# non utilisé & non nécessaire

    @Override
    public void start(Stage primaryStage) {

        double size = 50;
        int h = 200;
        int w = 200;
        double centerX = w / 2;
        double centerY = h / 2;
// #prof# position du cercle inutile puisqu'il s'agit d'un StackPane
// #prof# plus élégant un tableau de cercles   // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
        Circle cercle0 = new Circle(centerX, centerY, size, Color.AQUA);/*Circle(double centerX, double centerY, double radius, Paint fill) */
        Circle cercle1 = new Circle(centerX, centerY, size * 4 / 5, Color.PINK);/*Circle(double centerX, double centerY, double radius, Paint fill) */
        Circle cercle2 = new Circle(centerX, centerY, size * 3 / 5, Color.AQUA);/*Circle(double centerX, double centerY, double radius, Paint fill) */
        Circle cercle3 = new Circle(centerX, centerY, size * 2 / 5, Color.PINK);/*Circle(double centerX, double centerY, double radius, Paint fill) */
        Circle cercle4 = new Circle(centerX, centerY, size * 1 / 5, Color.AQUA);/*Circle(double centerX, double centerY, double radius, Paint fill) */


        Button agrandir = new Button();
        /**
         * 1.1%
         */
        Button reduire = new Button();
        /**
         * 0.9%
         */

        agrandir.setText("Agrandir");
        reduire.setText("Réduire");
        agrandir.setOnMouseClicked(event -> {

            aggrandirMethode(cercle0);  // #prof# bonne idée +1
            aggrandirMethode(cercle1);
            aggrandirMethode(cercle2);
            aggrandirMethode(cercle3);
            aggrandirMethode(cercle4);

        });

        reduire.setOnMouseClicked(event -> {

            reduireMethode(cercle0);  // #prof# bonne idée +1
            reduireMethode(cercle1);
            reduireMethode(cercle2);
            reduireMethode(cercle3);
            reduireMethode(cercle4);

        });

        StackPane image = new StackPane(cercle0, cercle1, cercle2, cercle3, cercle4);

        HBox boutonsBas = new HBox(agrandir, reduire);
        boutonsBas.setPrefWidth(h); // #prof# non nécessaire
        boutonsBas.setAlignment(Pos.CENTER);
        BorderPane bordure = new BorderPane();
        bordure.setCenter(image);

        bordure.setBottom(boutonsBas);

        Scene scene = new Scene(bordure, h, w);

        primaryStage.setTitle("Cercles imbriqués");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

    public void aggrandirMethode(Circle cercle) {
        cercle.setRadius(cercle.getRadius() * 1.1);

    }

    public void reduireMethode(Circle cercle) {
        cercle.setRadius(cercle.getRadius() * 0.9);

    }

}
