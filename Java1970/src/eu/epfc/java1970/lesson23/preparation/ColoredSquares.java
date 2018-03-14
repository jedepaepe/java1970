package eu.epfc.java1970.lesson23.preparation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColoredSquares extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        int size = 500;
        Pane pane = new Pane();
        int y = 0;
        for(int x=0; x<10; x++) {
            Rectangle r = new Rectangle(size/10.0, size/10.0, Color.color(x/10.0, 0, 0));
            r.setX(x*size/10);
            r.setY(0);
            pane.getChildren().add(r);
        }
        for(int x=0; x<10; x++) {
            Rectangle r = new Rectangle(size/10.0, size/10.0, Color.color(0, x/10.0, 0));
            r.setX(x*size/10);
            r.setY(size/10);
            pane.getChildren().add(r);
        }
        for(int x=0; x<10; x++) {
            Rectangle r = new Rectangle(size/10.0, size/10.0, Color.color(0, 0, x/10.0));
            r.setX(x*size/10);
            r.setY(2*size/10);
            pane.getChildren().add(r);
        }
        Scene scene = new Scene(pane, size, size * 3/ 10);
        primaryStage.setTitle("Colored Squares");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
}
