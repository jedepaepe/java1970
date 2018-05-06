/*
https://docs.oracle.com/javafx/2/ui_controls/file-chooser.htm
*/
package eu.epfc.java1970.preparation.fichier;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Experiment JavaFX FileChooser
 */
public class ExFileChooser extends Application {

    File file;
    
    @Override
    public void start(Stage stage) throws Exception {
        final FileChooser fileChooser = new FileChooser();      // instancie un :FileChooser
        final Button btnOpen = new Button("Ouvrir");
        Label lblFileProperties = new Label();
        lblFileProperties.setStyle("-fx-line-spacing: 0.8em;" + 
                "-fx-border-color: white;" +
                "-fx-border-width: 3;" + 
                "-fx-padding: 20;" +
                "-fx-border-radius: 20;");
        
        
        btnOpen.setOnAction((ActionEvent event) -> {
            fileChooser.setTitle("Choississez un fichier");
            file = fileChooser.showOpenDialog(stage);
            StringBuilder sb = new StringBuilder();
            sb.append("Name: ").append(file.getName()).append('\n');
            sb.append("Parent: ").append(file.getParent()).append('\n');
            sb.append("Path: ").append(file.getPath()).append('\n');
            sb.append("Absolute Path: ").append(file.getAbsolutePath()).append('\n');
            try {
                sb.append("Canonical Path: ").append(file.getCanonicalPath()).append('\n');
                // note: difference between absolute & canonical is quite subtil, usually, use Canonical
            } catch (IOException ex) {
                Logger.getLogger(ExFileChooser.class.getName()).log(Level.SEVERE, null, ex);
            }
            sb.append("Can Execute? : ").append(file.canExecute()).append('\n');
            sb.append("Can Read? : ").append(file.canRead()).append('\n');
            sb.append("Can Write? : ").append(file.canWrite()).append('\n');
            sb.append("Length: ").append(file.length()).append('\n');
            //sb.append("Free Space: ").append(file.getFreeSpace()).append('\n');
            //sb.append("Total Space: ").append(file.getTotalSpace()).append('\n');
            //sb.append("Usable Space: ").append(file.getUsableSpace()).append('\n');
            sb.append("Is Directory? : ").append(file.isDirectory()).append('\n');
            sb.append("Is file? : ").append(file.isFile()).append('\n');
            sb.append("Is Hidden? : ").append(file.isHidden()).append('\n');
            
            lblFileProperties.setText(sb.toString());
        });
        
        VBox vbox = new VBox(btnOpen, lblFileProperties);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20, 20, 20, 20));
        vbox.setSpacing(10);
        Scene scene = new Scene(vbox, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Exemple FileChooser");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
