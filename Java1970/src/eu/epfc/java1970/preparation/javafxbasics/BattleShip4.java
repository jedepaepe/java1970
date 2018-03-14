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
 * identique à  BattleShip3 excepté que de "vrais" bateaux sont générés
 */
public class BattleShip4 extends Application {

    private int columnNumber = 10;
    private int lineNumber = 10;
    private double size = 50.0;
    private int hgap = 2;
    private int vgap = 2;
    private Color backgroundColor = Color.BEIGE;
    private Color nothingColor = Color.BLUE;
    private Color shipColor = Color.BLACK;
    private int[] shipList = {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5};
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
        // ajoute les bateau
        for(int i=0; i<shipList.length; i++) {  // boucle sur les bateau
            int shipLength = shipList[i];       // récupère la longueur du bateau (nombre de cases)
            int x = (int)( Math.random() * columnNumber);   // tire la position initiale
            int y = (int) (Math.random() * lineNumber);
            rectangleList[x][y].setFill(shipColor);         // colorie la position initiale
            if(shipLength > 1) {                            // si ce n'est pas un sousmarin
                int xDirection = (int) (Math.random() * 3) - 1; // tire la direction (retourne -1, 0, 1)
                int yDirection = (int) (Math.random() * 3) - 1;
                while(xDirection == 0 && yDirection == 0) { // on ne veut pas de direction nulle (0, 0)
                    xDirection = (int) (Math.random() * 3) - 1;
                    yDirection = (int) (Math.random() * 3) - 1;
                }
                for(int p=1; p<shipLength; p++) {           // pour chaque case suivante
                    x = (x + xDirection) % columnNumber;    // calcule la position de la case
                    y = (y + yDirection) % lineNumber;
                    rectangleList[x][y].setFill(shipColor); // colorie la case
                }
            }
        }
        Scene scene = new Scene(gridPane);
        scene.setFill(backgroundColor);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battle Ship");
        primaryStage.show();
    }
    
}
