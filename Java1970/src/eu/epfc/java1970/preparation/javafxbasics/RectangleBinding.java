/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.preparation.javafxbasics;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author FHA576
 */
public class RectangleBinding extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle rectangle = new Rectangle(50, 50, Color.color(120, 120, 120));
    }
    
}
