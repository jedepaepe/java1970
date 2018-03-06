package eu.epfc.java1970.lesson22.anode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author FHA576
 */
public class TwoSquares extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        int size = 100;
        Rectangle r1 = new Rectangle(size, size);
        r1.setX(size/2);
        r1.setY(size/2);
        r1.setFill(Color.BLUE);
        Rectangle r2 = new Rectangle(size, size);
        r2.setX(size/2);
        r2.setY(size/2);
        r2.setFill(Color.YELLOW);
        r1.setRotate(45);
        Pane pane = new Pane(r1, r2);
        Scene scene = new Scene(pane, 2*size, 2*size);
        primaryStage.setTitle("squares");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
