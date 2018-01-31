/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.preparations.javafx.cssdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * CssDemo illustres :
 * 1) comment appliquer un feuille de style (fichier css) à une :Scene
 * 2) comment exécuter sur code sur un événement
 * note: ce code est généré par Netbeans, 
 *      excepté le CSS, 
 *      mais il faut pour cela créer une application Netbeans
 * @author jedepaepe
 */
public class CssDemo extends Application {
    
    @Override
    public void start(Stage stage) {
        Button btn = new Button();                  // crée un button
        btn.setText("Say 'Hello World'");           // écrit le texte du button
                                                    // ses deux lignes sont équivalentes à 
                                                    // Button btn = new Button("Say 'Hello World'");
                                                    
        btn.setOnAction((ActionEvent event) -> {    // associe du code au button (utilise une lambda expression)
            System.out.println("Hello World!");     // code exécuter lorsqu'on clique sur le button (code exécuté sur évenement)
        });
        
        StackPane root = new StackPane();           // crée un pane de type StackPane
        root.getChildren().add(btn);                // ajoute le button au pane
                                                    // ceci est équivalent au code:
                                                    // StackPane root = new StackPane(btn);
        
        Scene scene = new Scene(root, 300, 250);    // crée une Scene de taille 300px X 250px
        
        // code ajouté:
        scene.getStylesheets().add("resources/css/button.css"); // lit le fichier button.css 
                                                                // et applique le CSS aux éléments de la Scene
                                                                // (ici, il n'y a que le btn:Button )
        // la ligne 45 équivalent (dans le cas présent) à
        // btn.setStyle("-fx-background-color: red; ");
        // seulement dans le cas présent, car la ligne 45 style tous les buttons de scene:Scene
        // alors que la ligne 49 ne style que btn:Button
        
        stage.setTitle("Hello World!");      // assigne le titre de la fenêtre stage:State
        stage.setScene(scene);               // assigne scene:Scene à la fenêtre stage:Stage
        stage.show();                       // dessine la fenêtre stage:Stage à l'écran
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
