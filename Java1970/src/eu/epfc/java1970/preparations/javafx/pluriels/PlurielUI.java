
package eu.epfc.java1970.preparations.javafx.pluriels;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Exercice pour les pluriels
 * @author jedepaepe
 */
public class PlurielUI extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {        
        Text singular = new Text("cheval");     
        TextField plural = new TextField();
        plural.setMaxSize(100, 50);
        plural.setAlignment(Pos.CENTER);
        Button check = new Button("Vérifie");
        // crée une callback qui sera exécutée lorsque le button sera appuyé
        check.setOnAction((event) -> {
            if(plural.getText().equalsIgnoreCase("chevaux")) {
                plural.setStyle("-fx-control-inner-background:#00FF00");
            } else {
                plural.setStyle("-fx-control-inner-background:#FF0000");
            }
        });
        
        
        VBox vbox = new VBox(singular, plural, check);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 200, 150);
        stage.setScene(scene);
        stage.setTitle("Pluriels");
        stage.show();
    }
    
    
    
}
