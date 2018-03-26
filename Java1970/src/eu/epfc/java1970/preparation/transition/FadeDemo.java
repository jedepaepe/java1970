/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.preparation.transition;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

// http://www.informit.com/articles/article.aspx?p=2359759

public class FadeDemo extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
   @Override
   public void start(Stage primaryStage)
   {
      ImageView iv = new ImageView();
      Image image = new Image("file:resources/images/flowers.jpg");
      iv.setImage(image);

      FadeTransition ft = new FadeTransition();
      ft.setNode(iv);
      ft.setDuration(new Duration(2000));
      ft.setFromValue(1.0);
      ft.setToValue(0.0);
      ft.setCycleCount(6);
      ft.setAutoReverse(true);

      iv.setOnMouseClicked(me -> ft.play());

      Group root = new Group();
      root.getChildren().add(iv);
      Scene scene = new Scene(root, image.getWidth(), image.getHeight());

      primaryStage.setTitle("FadeTransition Demo");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}