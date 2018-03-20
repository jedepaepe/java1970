/*
 */
package eu.epfc.java1970.lesson24.preparation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Example copié de TutorialsPoint, JavaFX - Event Handling
 * https://www.tutorialspoint.com/javafx/javafx_event_handling.htm
 */
public class CircleClick extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // crée un cercle
        Circle circle = new Circle(300, 135, 25, Color.BROWN);
        // 
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            Color color = (circle.getFill() == Color.DARKSLATEBLUE) ? Color.BROWN : Color.DARKSLATEBLUE;
            circle.setFill(color);
        });
        
        Text text = new Text(150, 150, "Clique sur le cercle pour changer sa couleur");
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.CRIMSON);
        
        // code classique
        VBox root = new VBox(circle, text);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.LAVENDER);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Event Filter Example");
        primaryStage.show();
    }
    
}
