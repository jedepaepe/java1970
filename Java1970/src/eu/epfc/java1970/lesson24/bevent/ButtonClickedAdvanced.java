/*
 * Une version simplifiée du listing 15.1 HandleEvent.java
 * page 587 du livre
 * il s'agit en fait d'un utilisation des lambda expressions décrites
 * à la section 15.6 Simplifying Event Handling Using Lambda Expressions, page 597
 */
package eu.epfc.java1970.lesson24.preparation;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Un bouton qui écrit dans la console quand on le clique
 */
public class ButtonClickedAdvanced extends Application {
    private boolean isWhite = true; // défini dans la classe pour exister longtemps

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // crée un bouton
        Button color = new Button("VERT");
        Button close = new Button("FERMER");
        
        // associe le code entre {...} à l'action de cliquer sur le bouton
        color.setOnAction((ActionEvent event) -> {
            if( isWhite ) {
                color.setStyle("-fx-background-color: #00ff00");
                color.setText("BLANC");
                isWhite = false;
            } else {
                color.setStyle("-fx-background-color: #ffffff");
                color.setText("VERT");
                isWhite = true;
            }
        });
        
        close.setOnAction(event -> {
            Platform.exit();
        });

        // code habituel
        FlowPane root = new FlowPane(color, close);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Listing 15.1");
        primaryStage.show();
    }

}
