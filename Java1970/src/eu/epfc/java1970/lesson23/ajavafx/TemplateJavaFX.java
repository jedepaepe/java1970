package eu.epfc.java1970.lesson23.ajavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author jedepaepe
 */
public class TemplateJavaFX extends Application {

    // lance l'application
    public static void main(String[] args) {
        launch(args);
    }
    
    // pour initialiser la fenêtre (primaryStage)
    @Override
    public void start(Stage primaryStage) {
        // créez les objets
        Rectangle blueRectangle = new Rectangle(50, 50, Color.BLUE);
        Rectangle yellowRectangle = new Rectangle(100, 100, Color.YELLOW);
        
        // créez le pane (la vitre) principal
        StackPane root = new StackPane(yellowRectangle, blueRectangle);
        
        // toujours la même chose
        Scene scene = new Scene(root, 200, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Template");
        primaryStage.show();
    }

}
