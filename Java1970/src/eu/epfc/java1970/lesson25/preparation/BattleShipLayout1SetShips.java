/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.lesson25.preparation;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author FHA576
 */
public class BattleShipLayout1SetShips extends Application {

    Config config = new Config();

    private enum State {
        STARTING,
        CONFIGURING,
        PLAYING,
        DONE
    }
    
    Status status = new Status();

    private class Config {

        private int nrCells = 5;
        private int nrShips = 8;
        private int size = 25;
        private int gap = 2;
        private Color boardColor = Color.LIGHTGRAY;
    }
    
    private final class Status extends SimpleStringProperty {
        State state;
        public Status() {
            super();
            setState(State.STARTING);
        }
        public void setStateConfiguring() {
            if(state == State.STARTING) {
                setState(State.CONFIGURING);
            }
        }
        public void setState(State state) {
            this.state = state;
            String text = "state : ";
            switch(state) {
                case STARTING:
                    text += "STARTING";
                    break;
                case CONFIGURING:
                    text += "CONFIGURING";
                    break;
                case PLAYING:
                    text += "PLAYING";
                    break;
                case DONE:
                    text += "DONE";
                    break;
            }
            set(text);
        }
        public State getState() {
            this.set("test");
            return state;
        }
        public boolean isState(State state) {
            return this.state == state;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label title = new Label("Battle Ship");
        GridPane ennemi = new ShipPane(config.nrCells, config.size);
        GridPane moi = new ShipPane(config.nrCells, config.size);
        Label statusLabel = new Label();
        statusLabel.textProperty().bind(status);
        VBox vBox = new VBox(title, ennemi, moi, statusLabel);
        vBox.getChildren().forEach((node) -> {
            node.setStyle("-fx-padding: 15px 15px 15px 15px");
        });
        vBox.setAlignment(Pos.CENTER);
        Label message = new Label("Please, configure\n"
                + config.nrShips
                + " one-cell ships\n"
                + "Click here to begin");
        message.setWrapText(true);
        message.setPadding(new Insets(15));
        message.setFont(new Font("Arial", 16));
        message.setStyle("-fx-background-color: white;");
        message.setStyle("-fx-backgroud-color: brown");
        message.setOnMouseClicked(event -> {
            status.setStateConfiguring();
            Duration duration = Duration.millis(500);
            FadeTransition fade = new FadeTransition(duration, message);
            fade.setFromValue(1);
            fade.setToValue(0);
            fade.play();
            Timeline time = new Timeline(new KeyFrame(duration, (ae) -> {
                message.setVisible(false);
            }));   
        });
        StackPane stackPane = new StackPane(vBox, message);
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
