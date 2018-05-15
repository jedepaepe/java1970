/*
 */
package eu.epfc.java1970.lesson28.productList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 */
public class JavaFxVersion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        readFile();
        Button button = new Button("open");
        button.setOnAction((event) -> {
            try {
                System.out.println("via hardcoded file");
                readFile();
                System.out.println("via FileChooser");
                readFileFromChooser(stage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(JavaFxVersion.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Pane pane = new StackPane(button);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    
    private void readFileFromChooser(Stage stage) {
        try {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(stage);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaFxVersion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void readFile() throws FileNotFoundException {
        Scanner file = new Scanner(new File("ReadMe.txt"));
        while (file.hasNext()) {
            System.out.println(file.nextLine());
        }
        file.close();
    }

}
