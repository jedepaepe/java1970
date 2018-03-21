/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.lesson25.preparation;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author FHA576
 */
public class BattleShipLayout extends Application {
    Config config = new Config();

    private class Config {
        private int nrCells = 5;
        private int nrBattle = 8;
        private int size = 25;
        private int gap = 2;
        private Color boardColor = Color.LIGHTGRAY;
    }
    

    public static void main(String[] args) {
        launch(args);
    }

    private void initBorder(GridPane gridPane) {
        gridPane.setHgap(config.gap);
        gridPane.setVgap(config.gap);
        gridPane.setPadding(new Insets(10));
        for (int col = 0; col < config.nrCells; col++) {
            for (int line = 0; line < config.nrCells; line++) {
                Rectangle rectangle = new Rectangle(config.size, config.size, Color.BLUE);
                gridPane.add(rectangle, col, line);
                rectangle.setOnMouseClicked(event -> {
                    if (rectangle.getFill().equals(Color.BLUE)) {
                        rectangle.setFill(Color.WHITE);
                    } else {
                        rectangle.setFill(Color.BLUE);
                    }
                });
            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text title = new Text("Battle Ship");
        GridPane ennemi = new GridPane();
        initBorder(ennemi);
        GridPane moi = new GridPane();
        initBorder(moi);
        VBox vBox = new VBox(title, ennemi, moi);
        Text result = new Text("You win");
        StackPane stackPane = new StackPane(vBox, result);
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
