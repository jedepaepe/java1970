package eu.epfc.java1970.lesson18;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author jedepaepe
 */
public class MultiStage extends Application {

    @Override
    public void start(Stage first) {
        first.setTitle("Première");
        first.show();
        first.setX(0);
        first.setY(0);
        for (int i = 0; i < 10; i++) {
            Stage other = new Stage();
            other.setTitle("Autre " + i);
            other.show();
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
