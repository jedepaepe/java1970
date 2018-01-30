package eu.epfc.java1970.lesson18;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author jedepaepe
 */
public class PaneDemo extends Application {

    @Override
    public void start(Stage stage) {
        Button buttonOK = new Button("OK");
        Text text = new Text("Voici un text");
        text.setFill(Color.BLUE);
        TextField textField = new TextField();

        VBox vbox = new VBox(text, textField);
        buttonOK.setAlignment(Pos.CENTER);
        //pane.setSpacing(10);
        FlowPane flowPane = new FlowPane(buttonOK, vbox);
        FlowPane.setMargin(buttonOK, new Insets(30, 60, 30, 60));
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
