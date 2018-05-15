/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.lesson28.productList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author 0907thverlynde
 */
public class ExerciceParsing extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Label lab = new Label();
        VBox box = new VBox(lab, btn);
        btn.setOnAction((event) -> {
            try {
                FileChooser filechoose = new FileChooser();
                File file = filechoose.showOpenDialog(primaryStage);
                ArrayList<String> list = new ArrayList<String>();
                Scanner scan;
                scan = new Scanner(new BufferedReader(new FileReader(file)));
                while (scan.hasNext()) {
                    list.add(scan.nextLine());
                }
                ;
                System.out.println(list.size());
                System.out.println(list);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ExerciceParsing.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
