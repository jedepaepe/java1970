package eu.epfc.java1970.preparation.javafxbasics;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Simple battle ship
 * identique à  BattleShip2 excepté que des "bateaux sont générés"
 */
public class BattleShip3 extends Application {

    private int columnNumber = 10;
    private int lineNumber = 10;
    private double size = 50.0;
    private int hgap = 2;
    private int vgap = 2;
    private Color backgroundColor = Color.BEIGE;
    private Color nothingColor = Color.BLUE;
    private Color shipColor = Color.BLACK;
    private int shipNumber = 15;
    private Rectangle[][] rectangleList = new Rectangle[lineNumber][columnNumber];
    
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
        for(int x=0; x<columnNumber; x++) {
            for(int y=0; y<lineNumber; y++) {
                Rectangle rectangle = new Rectangle(size, size, nothingColor);
                rectangleList[x][y] = rectangle;
                gridPane.add(rectangle, x, y);
            }
        }
        for(int n=0; n<shipNumber; n++) {
            int x = (int)( Math.random() * columnNumber);
            int y = (int) (Math.random() * lineNumber);
            rectangleList[x][y].setFill(shipColor);
        }
        Scene scene = new Scene(gridPane);
        scene.setFill(backgroundColor);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battle Ship");
        primaryStage.show();
    }
    
}
