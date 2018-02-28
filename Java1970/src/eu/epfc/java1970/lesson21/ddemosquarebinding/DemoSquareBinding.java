/*
afficher un carré
son côté doit être 1/2 largeur de la fenêtre (avec le binding), donc
"bindez" la largeur du rectangle/carré avec la largeur de la fenêtre
"bindez" la hauteur du rectangle/carré avec la largeur de la fenêtre
centrez le carré (avec le binding)
coloriez le carré en rose
ajoutez une bordure mauve
cherchez s'il est possible de "binder" a largeur de la bordure avec la largeur de la fenêtre (divisé par 10).*/
package eu.epfc.java1970.lesson21.ddemosquarebinding;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DemoSquareBinding extends Application {

    float width = 500;   // side of 100 pixel
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle square = new Rectangle();
        Pane pane = new Pane(square);

        // son côté doit être 1/2 largeur de la fenêtre (avec le binding), donc
        // "bindez" la largeur du cercle avec la largeur de la fenêtre
        // "bindez" la hauteur du cercle avec la largeur de la fenêtre
        square.widthProperty().bind(pane.widthProperty().divide(4));
        square.heightProperty().bind(pane.widthProperty().divide(4));
        
        // centrez le carré (avec le binding)
        square.xProperty().bind(pane.widthProperty().subtract(square.widthProperty()).divide(2));
        square.yProperty().bind(pane.heightProperty().subtract(square.heightProperty()).divide(2));
        
        // coloriez le carré en rose
        square.setFill(Color.PINK);

        // ajoutez une bordure mauve
        square.setStroke(Color.PURPLE);

        //cherchez s'il est possible de "binder" a largeur de la bordure avec la largeur de la fenêtre (divisé par 10).
        square.strokeWidthProperty().bind(pane.widthProperty().divide(10));
        
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Binded Square");
        stage.show();
    }
    
}
