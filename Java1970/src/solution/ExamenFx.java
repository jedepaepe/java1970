package solution;


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
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Créez une application Java FX avec:
 * 5 cercles 
 *  de tailles respectives 50, 40, 30, 20, 10
 *  de couleur AQUA (bleu mer) et PINT (rose) alternativement
 *  centrés dans un cadre
 * 2 boutons avec les textes suivants
 *  agrandir : agrandit les cercles de 10% (radius * 1.1)
 *  réduire : réduit les cercles de 10% (radius * 0.9)
 *  alignés et centrés dnas un cadre
 * Les deux cadres doivent être tracés
 * Il doit y avoir un espace de 10 pixels entre les cadres et le bord de la fenêtre
 * Il doit y avoir un espace
 * Les cercles doivent rester
 */
public class ExamenFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        double radius = 50;
        double factor = 8;
        Circle[] circles = new Circle[5];
        for (int i=0; i < circles.length; i++) {
            circles[i] = new Circle(radius - i * 10, (i % 2) == 0 ? Color.AQUA : Color.PINK);
        }
        StackPane stackPane = new StackPane(circles);
        stackPane.setPadding(new Insets(10, 0, 10, 0));
        stackPane.setStyle("-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: gray;");
        Button bAgrandir = new Button("Agrandir");
        Button bReduire = new Button("Réduire");
        HBox hBox = new HBox(10, bAgrandir, bReduire);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10, 0, 10, 0));
        hBox.setStyle("-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 5;" + "-fx-border-color: gray;");
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(stackPane);
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane, factor * radius, (factor + 1) * radius, Color.BISQUE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Examen");
        primaryStage.show();
        
        bAgrandir.setOnAction((ActionEvent event) -> {
            for (Circle circle : circles) {
                circle.setRadius(circle.getRadius() * 1.1);
            }
        });
        
        bReduire.setOnAction((ActionEvent event) -> {
            for (Circle circle : circles) {
                circle.setRadius(circle.getRadius() * 0.9);
            }
        });
    }
    
}
