package eu.epfc.java1970.lesson21.democircle;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author jedepaepe
 */
public class DemoCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//Crée l'objet circle:Circle
        Circle circle = new Circle();

        // Ajuste les propriétés du cercle
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(100.0f);
        circle.setFill(Color.YELLOW);             // couleur de remplissage
        circle.setStroke(Color.ORANGE);      // couleur de la bordure
        circle.setStrokeWidth(5);                    // largeur de la bordure

        // Crée un Pane et ajoute circle à ce Pane
        Pane pane = new Pane(circle);
        
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        Rectangle square = new Rectangle();
        
        square.xProperty()
                .bind(pane.widthProperty()
                        .subtract(square.widthProperty())
                        .divide(2));
        
        square.strokeWidthProperty().bind(pane.widthProperty().divide(10));
        
        //circle.radiusProperty().bind(pane.);

        // Crée l'objet scene:Scene
        Scene scene = new Scene(pane, 600, 300);

        // Ajoute la scène (scene:Scene) à la fenêtre (stage:Stage)
        stage.setScene(scene);

        // Donne un titre à la fenêtre
        stage.setTitle("Drawing a Circle");

        // Affiche la fenêtre à l'écran
        stage.show();
    }

}
