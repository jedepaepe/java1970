package eu.epfc.java1970.lesson23.battleship;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Simple battle ship
 * Cette version implémente seulement une grille 3x3 
 */
public class BattleShip2 extends Application {

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
        for(int col=0; col<3; col++) {  // boucle sur les lignes
            for(int line=0; line<3; line++) {   // boucle sur les colonnes
                // ajoute un Rectangle à la colonne "col" et à la ligne "line"
                gridPane.add(new Rectangle(50, 50, Color.BLUE), col, line);
            }
        }
        
        // ajoute les sous-marins
        for(int i=0; i<3; i++) {
            int col = (int)( Math.random() * 3);
            int line = (int) (Math.random() * 3);
            gridPane.add(new Rectangle(50, 50, Color.WHITE), col, line);    // ajoute le sous-marin
            // note: ce serait mieux de repeindre le rectangle à cette position, mais le code est plus complexe
        }
        
        // code classique
        Scene scene = new Scene(gridPane);
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battle Ship");
        primaryStage.show();
    }
    
}
