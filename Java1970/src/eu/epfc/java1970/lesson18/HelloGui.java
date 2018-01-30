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
 * @author jedepaepe
 */
public class HelloGui extends Application {

    @Override
    public void start(Stage stage) {        // reçoit une fenêtre en référence
        Button hello = new Button("hello"); // crée un Button (dans la mémoire)
        hello.setMinSize(100, 60);          // taille minimum du button
        hello.setMaxSize(100, 60);          // taille maximum : ne change rien car le button est le parent (directement attaché à la scene)
        hello.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
                
        Scene scene = new Scene(hello);     // associe le Button 
        stage.setScene(scene);              // crée le lien entre stage et scene
        stage.setHeight(500);
        stage.setWidth(800);
        stage.setTitle("hello");
        
        stage.show();   // force l'affichage de la fenêtre
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
