package eu.epfc.java1970.lesson23.gridpanedemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author jedepaepe
 */
public class IntoxicationForm extends Application {

    GridPane gridPane = new GridPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(10);
        createLine("Nom:", 0);
        createLine("Description:", 1);
        createLine("Population:", 2);
        createLine("Critere:", 3);

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.setTitle("Formulaire Intox");
        stage.show();
    }

    /**
     * Crée une ligne dans le gridPane avec un Label et un TextField
     * @param label
     * @param line 
     */
    private void createLine(String label, int line) {
        Label labelNom = new Label(label);
        gridPane.add(labelNom, 0, line);
        TextField inputNom = new TextField();
        gridPane.add(inputNom, 1, line);

    }

}






