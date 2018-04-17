/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.preparation.javafxbasics;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author FHA576
 */
public class FadeTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle rect = new Rectangle(200, 50, Color.RED);
        FadeTransition fadeInOut = new FadeTransition(Duration.seconds(2), rect);
        fadeInOut.setFromValue(1.0);
        fadeInOut.setToValue(.20);
        fadeInOut.setAutoReverse(true);
        fadeInOut.setCycleCount(20);
        StackPane root = new StackPane(rect);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
        fadeInOut.play();
        Timeline timeline = new Timeline(new KeyFrame(
                Duration.millis(2500),
                ae -> {rect.setVisible(false);}
        ));
        timeline.play();
    }

}
