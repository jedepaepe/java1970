package eu.epfc.java1970.preparation.javafxbasics;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Simple battle ship identique à BattleShip5 mais refactorisé
 */
public class BattleShip6 extends Application {

    /**
     * Rassembler les éléments de configuration dans une classe
     */
    private static class Config {
        private static int columnNumber = 10;
        private static int lineNumber = 10;
        private static double size = 50.0;
        private static int hgap = 2;
        private static int vgap = 2;
        private static Color backgroundColor = Color.BEIGE;
        private static Color nothingColor = Color.BLUE;
        private static Color shipColor = Color.BLACK;
        private static Color shipFireColor = Color.RED;
        private static Color fireColor = Color.YELLOW;
    }
    
    class Cell extends Rectangle {
        
    }
    
    private BattleBoard battleBoard = new BattleBoard(Config.columnNumber, Config.lineNumber);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
//        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(Config.hgap);
        gridPane.setVgap(Config.vgap);

        for (int x = 0; x < Config.columnNumber; x++) {
            for (int y = 0; y < Config.lineNumber; y++) {
                BattleCell battleCell = battleBoard.getCell(x, y);
                Color color = getCellColor(battleCell.isShip, battleCell.isFire);
                Rectangle rectangle = new Rectangle(Config.size, Config.size, color);
                gridPane.add(rectangle, x, y);
                
            }
        }

        // code classique
        Scene scene = new Scene(gridPane);
        scene.setFill(Config.backgroundColor);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battle Ship");
        primaryStage.show();
    }

    private Color getCellColor(boolean isShip, boolean isFire) {
        if (isShip && !isFire) {
            return Config.shipColor;
        }
        if (isShip && isFire) {
            return Config.shipFireColor;
        }
        if (!isShip && isFire) {
            return Config.fireColor;
        }
        return Config.nothingColor;
    }

    class BattleBoard {

        private int[] shipList = {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5};
        private BattleCell[][] cellList;

        int getXLength() {
            return cellList[0].length;
        }

        int getYLength() {
            return cellList.length;
        }

        BattleCell getCell(int x, int y) {
            return cellList[x][y];
        }

        public BattleBoard(int columnNumber, int lineNumber) {
            // initialise la liste des cellules
            cellList = new BattleCell[lineNumber][columnNumber];
            for (int x = 0; x < lineNumber; x++) {
                for (int y = 0; y < columnNumber; y++) {
                    cellList[x][y] = new BattleCell();
                }
            }

            // ajoute les bateau
            for (int i = 0; i < shipList.length; i++) {  // boucle sur les bateau
                int shipLength = shipList[i];       // récupère la longueur du bateau (nombre de cases)
                int x = (int) (Math.random() * columnNumber);   // tire la position initiale
                int y = (int) (Math.random() * lineNumber);
                cellList[x][y].setIsShip(true);         // colorie la position initiale
                if (shipLength > 1) {                            // si ce n'est pas un sousmarin
                    int xDirection = (int) (Math.random() * 3) - 1; // tire la direction (retourne -1, 0, 1)
                    int yDirection = (int) (Math.random() * 3) - 1;
                    while (xDirection == 0 && yDirection == 0) { // on ne veut pas de direction nulle (0, 0)
                        xDirection = (int) (Math.random() * 3) - 1;
                        yDirection = (int) (Math.random() * 3) - 1;
                    }
                    for (int p = 1; p < shipLength; p++) {           // pour chaque case suivante
                        x = (x + xDirection) % columnNumber;    // calcule la position de la case
                        x = (x < 0) ? columnNumber + x : x;         // évite un nombre négatif
                        y = (y + yDirection) % lineNumber;
                        y = (y < 0) ? lineNumber + y : y;
                        cellList[x][y].setIsShip(true); // colorie la case
                    }
                }
            }
        }

    }

    class BattleCell {

        private boolean isShip = false;
        private boolean isFire = false;

        public BattleCell() {
        }

        public BattleCell(boolean isShip, boolean isFire) {
            this.isShip = isShip;
            this.isFire = isFire;
        }

        public boolean isIsShip() {
            return isShip;
        }

        public void setIsShip(boolean isShip) {
            this.isShip = isShip;
        }

        public boolean isIsFire() {
            return isFire;
        }

        public void setIsFire(boolean isFire) {
            this.isFire = isFire;
        }

    }

}
