package eu.epfc.java1970.lesson24.bevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 */
public class CircleClicked extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(100, Color.AQUA);
        circle.setOnMouseClicked(event -> {
            circle.setRadius(circle.getRadius() + 5);
        });
        StackPane root = new StackPane(circle);
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
    
}
