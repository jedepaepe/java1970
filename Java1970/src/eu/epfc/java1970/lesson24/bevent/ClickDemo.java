/*
 * Une version simplifiée du listing 15.1 HandleEvent.java
 * page 587 du livre
 * il s'agit en fait d'un utilisation des lambda expressions décrites
 * à la section 15.6 Simplifying Event Handling Using Lambda Expressions, page 597
*/
package eu.epfc.java1970.lesson24.bevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Un bouton qui écrit dans la console quand on le clique
 */
public class ClickDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // crée un bouton
        Button button = new Button("Ecrire");
        
        // associe le code entre {...} à l'action de cliquer sur le bouton
        button.setOnAction((ActionEvent event) -> {
            System.out.println("Boutton cliqué");   // mettre ici son code
        });
        
        // code habituel
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Listing 15.1");
        primaryStage.show();
    }
    
}
