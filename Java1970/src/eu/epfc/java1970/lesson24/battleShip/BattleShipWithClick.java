package eu.epfc.java1970.lesson23.battleship;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Simple battle ship Cette version implémente seulement une grille 3x3
 */
public class BattleShipWithClick extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();     // crée le :GridPane
        gridPane.setAlignment(Pos.CENTER);      // centre les objets dans les cellules
        gridPane.setPadding(new Insets(10));    // ajoute de l'espace entre entre le bord et le contenu
        gridPane.setHgap(10);                   // ajoute des gouttières horizontales (espace entre les cellules)
        gridPane.setVgap(10);                   // ajoute des gouttières verticales

        // pour construire le tableau de 3x3 cellules
        for (int col = 0; col < 10; col++) {  // boucle sur les lignes
            for (int line = 0; line < 10; line++) {   // boucle sur les colonnes
                // ajoute un Rectangle à la colonne "col" et à la ligne "line"
                // 1. créer le rectangle, new Rectangle(50, 50, Color.BLUE)
                Rectangle rectangle = new Rectangle(50, 50, Color.BLUE);
                // 2. associé la lambda expression au rectangle avec setOnMouseClicked
                // 3. ajouter le rectangle au grid pane, gridPane.add( ... , col, line);
                gridPane.add(rectangle, col, line);
                rectangle.setOnMouseClicked(event -> {
                    if (rectangle.getFill().equals(Color.BLUE)) {
                        rectangle.setFill(Color.WHITE);
                    } else {
                        rectangle.setFill(Color.BLUE);
                    }
                });
            }
        }

        // code classique
        Scene scene = new Scene(gridPane);
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battle Ship");
        primaryStage.show();
    }

}
