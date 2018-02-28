/*
Reprenez le code ci-dessus et:

"bindez" la position X du cercle avec la largeur du pane (divisé par 2)
"bindez" la position Y du cercle avec la hauteur du pane (divisé par 2)
"bindez" le rayon du cercle avec la largeur du pane (divisé par 4) 
*/

package eu.epfc.java1970.lesson21.cdemoCircleBinding;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DemoCircleBinding extends Application {
    
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Crée l'objet circle:Circle
        Circle circle = new Circle();

        // Ajuste les propriétés du cercle
/* pas nécessaire car remplacé par le binding
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(100.0f);
*/
        circle.setFill(Color.YELLOW);             // couleur de remplissage
        circle.setStroke(Color.ORANGE);      // couleur de la bordure
        circle.setStrokeWidth(5);                    // largeur de la bordure

        // Crée un Pane et ajoute circle à ce Pane
        Pane pane = new Pane(circle);
        
        // Crée l'objet scene:Scene
        Scene scene = new Scene(pane, 600, 300);

        // "bindez" la position X du cercle avec la largeur du pane (divisé par 2)
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        //"bindez" la position Y du cercle avec la hauteur du pane (divisé par 2)
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        //"bindez" le rayon du cercle avec la largeur du pane (divisé par 4) 
        circle.radiusProperty().bind(pane.widthProperty().divide(4));

        // Ajoute la scène (scene:Scene) à la fenêtre (stage:Stage)
        stage.setScene(scene);

        // Donne un titre à la fenêtre
        stage.setTitle("Binded Circle");

        // Affiche la fenêtre à l'écran
        stage.show();
    }
}
