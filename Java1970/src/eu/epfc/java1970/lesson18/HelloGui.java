package eu.epfc.java1970.lesson18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * Première application GUI (Graphical User Interface) 
 * avec JavaFX
 * La classe HelloGUi doit hérité (extends) de la classe javafx.application.application
 *      pour faire une application JavaFX
 * @author jedepaepe
 */
public class HelloGui extends Application {

    /**
     * la méthode start doit être implémenté
     * elle est appelé par le framework JavaFx au démarrage de l'application
     * c'est ici qu'il faut initialiser les composants graphiques
     */
    @Override
    public void start(Stage stage) {        // reçoit une fenêtre (stage) en référence
        Button hello = new Button("hello"); // crée un Button (dans la mémoire)
        hello.setMinSize(100, 60);          // taille minimum du button
        hello.setMaxSize(100, 60);          // taille maximum : ne change rien car le button est le parent (directement attaché à la scene)
        hello.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");   // change le style du bouton en utilisant le language JavaFX CSS:
                // -fx-font: 30 arial => utiliser la police de caractère arial, taille 30px
                // -fx-base: #ee2211 => utiliser un rouge #ee2211 : RGB, Red: ee, Green: 22, Blue: 11 (hexadecimal 0-F, F=15)
                
        Scene scene = new Scene(hello);     // crée la scene et lui associe le Button comme élément principal
        stage.setScene(scene);              // crée le lien entre stage et scene
        stage.setHeight(500);               // la stage a une hauteur de 500 px
        stage.setWidth(800);                // 
        stage.setTitle("hello");
        
        stage.show();   // force l'affichage de la fenêtre
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
