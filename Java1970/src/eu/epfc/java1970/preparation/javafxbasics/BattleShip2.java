package eu.epfc.java1970.preparation.javafxbasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Simple battle ship
 * Cette version implémente une grille nxn, 
 * de couleurs paramétrisées
 * et dont la taille varie avec la fenêtre
 */
public class BattleShip2 extends Application {

    private int columnNumber = 10;
    private int lineNumber = 10;
    private double size = 50.0;
    private int hgap = 2;
    private int vgap = 2;
    private Color backgroundColor = Color.BLACK;
    private Color nothingColor = Color.BLUE;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
//        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(hgap);
        gridPane.setVgap(vgap);
        primaryStage.show();
        for(int col=0; col<columnNumber; col++) {
            for(int line=0; line<lineNumber; line++) {
                gridPane.add(new Rectangle(size, size, nothingColor), col, line);
            }
        }
        Scene scene = new Scene(gridPane);
        scene.setFill(backgroundColor);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battle Ship");
        primaryStage.show();
    }
    
}
