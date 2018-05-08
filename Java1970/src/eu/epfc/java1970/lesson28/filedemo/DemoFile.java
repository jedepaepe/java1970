/*
Demo java.io.File & FileChooser
 */
package eu.epfc.java1970.lesson28.filedemo;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * 1) créez une class javaFX.Application (hérite de ) 2) créez la méthode start
 * 3) créez la méthode main 4) complétez la méthode start a) créez le :Button b)
 * créez le :Label c) créez le :VBox et y ajoutez les :Button & :Label d) créez
 * la :Scene et y ajoutez le :VBox e) liez la : Scene au :Stage f) implémentez
 * la méthode setOnAction du :Button
 */
public class DemoFile extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button buttonOpen = new Button("Open");
        Label labelFile = new Label(" text bidon ");
        VBox vbox = new VBox(buttonOpen, labelFile);
        Scene scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);

        stage.show();

        // quand on clique sur buttonOpen, exécute le code entre { ... }
        buttonOpen.setOnAction((event) -> {
            // code exécuté lorsqu'on clique sur buttonOpen
            System.out.println("Super ma lambda est déclenchée sur le click de buttonOpen");
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(stage);
            labelFile.setText(
                    "Exist? " + file.exists() + "\n"
                    + "Parent: " + file.getParent()
            );
        });
    }

}
