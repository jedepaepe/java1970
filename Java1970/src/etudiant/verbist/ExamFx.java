package etudiant.verbist;

/**
 * 2eme session
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


 
public class ExamFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        double height = 50;
        double factor = 8;
        Rectangle[] rectangles = new Rectangle[5];
        for (int i=0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(150- i * 10, 150- i * 10, (i % 2) == 0 ? Color.AQUA : Color.PINK);
        }
        
                
        StackPane stackPane = new StackPane(rectangles);
        stackPane.setPadding(new Insets(10, 0, 10, 0));
        stackPane.setStyle("-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-height: 5;" + "-fx-border-color: gray;");
        Button bDroite = new Button("Droite");
        Button bGauche = new Button("Gauche");
        HBox hBox = new HBox(10, bDroite, bGauche);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10, 0, 10, 0));
        hBox.setStyle("-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-height: 5;" + "-fx-border-color: gray;");
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(stackPane);
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane, factor * height, (factor + 1) * height, Color.BISQUE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Examen");
        primaryStage.show();
        
        bDroite.setOnAction((ActionEvent event) -> {
            for (Rectangle rectangle : rectangles) {
                rectangle.setRotate(rectangle.getRotate() + 10);
            }
        });
        
        bGauche.setOnAction((ActionEvent event) -> {
            for (Rectangle rectangle : rectangles) {
                rectangle.setRotate(rectangle.getRotate() - 10);
            }
        });
    }
    
}