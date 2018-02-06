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
    public void start(Stage stage) {            // stage (fenêtre) créé par JavaFx
        Text text = new Text("Voici un text");  // crée le text:Text
        text.setFill(Color.BLUE);
        TextField textField = new TextField();  // crée le textField:TextField (zone de saisie)

        VBox vbox = new VBox(text, textField);  // crée le layout vbox:VBox
                                                // crée le lien entre vbox:VBox et text:Text
                                                // crée le lien entre vbox:VBox et textField:TextField

        Button buttonOK = new Button("OK");     // crée le buttonOK:Button
        buttonOK.setAlignment(Pos.CENTER); 
        //pane.setSpacing(10);
        FlowPane flowPane = new FlowPane(buttonOK, vbox);   // crée un flowPane:FlowPane, layout où les éléments se dépose les derrières les autres, comme lorsqu'on écrit sur une feuille
                                                // crée le lien entre flowPane:FlowPane et buttonOK:Button
                                                // crée le lien entre flowPane:FlowPane et vbox:VBox (un container est placé dans un autre container)
        FlowPane.setMargin(buttonOK, new Insets(30, 60, 30, 60));
        Scene scene = new Scene(flowPane);      // crée la scene:Scene
                                                // créé le lien entre scene:Scene et flowPane:FlowPane
        stage.setScene(scene);                  // crée le lien entre stage:Stage et scene:Scene
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
