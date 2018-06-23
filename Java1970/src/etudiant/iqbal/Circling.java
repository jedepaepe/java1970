/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.iqbal;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
 
/**
*
* @author Faisal IQBAL
*/
public class Circling extends Application {
 
@Override
public void start(Stage primaryStage) {
    Button btn1 = new Button();
    Button btn2 = new Button();
        btn1.setText("Agrandir");   // #prof# indentation 
        btn2.setText("Reduire");
    //    
    primaryStage.setTitle("Circle in Circle");
    Group root = new Group();
    Scene scene = new Scene(root, 400, 300, Color.PINK);
    root.getChildren().add(btn1);
    root.getChildren().add(btn2);
    // Firest Circle      // #prof# better : Circle[] circles = {new Circle(50, Color.AQUA), new Circle(40, Color.PINK), ...}
    Ellipse circle1 = EllipseBuilder.create()   // #prof# use a Circle, more simple
            .centerX(200)
            .centerY(150)
            .radiusX(50)
            .radiusY(50)
            .strokeWidth(3)
            //.stroke(Color.BLACK)
            .fill(Color.AQUA)
            .build();
    // Second Circle
    Ellipse circle2 = EllipseBuilder.create()
            .centerX(200)
            .centerY(150)
            .radiusX(40)
            .radiusY(40)
            .strokeWidth(3)
            //.stroke(Color.BLACK)
            .fill(Color.GREY)
            .build();
    // Third Circle    
    Ellipse circle3 = EllipseBuilder.create()
            .centerX(200)
            .centerY(150)
            .radiusX(30)
            .radiusY(30)
            .strokeWidth(3)
            //.stroke(Color.BLACK)
            .fill(Color.AQUA)
            .build();
    // Forth Circle
    Ellipse circle4 = EllipseBuilder.create()
            .centerX(200)
            .centerY(150)
            .radiusX(20)
            .radiusY(20)
            .strokeWidth(3)
            //.stroke(Color.BLACK)
            .fill(Color.GREY)
            .build();
    // Fifth Circle
    Ellipse circle5 = EllipseBuilder.create()   // #prof# use an Array, simpler
            .centerX(200)
            .centerY(150)
            .radiusX(10)
            .radiusY(10)
            .strokeWidth(3)
            //.stroke(Color.BLACK)
            .fill(Color.AQUA)
            .build();
    // Draw Circle execution
    root.getChildren().add(circle1);    // #prof# use .addAll(circle1, circle2, ...)
    root.getChildren().add(circle2); 
    root.getChildren().add(circle3);
    root.getChildren().add(circle4);
    root.getChildren().add(circle5);
    // 
    primaryStage.setScene(scene);
    primaryStage.show();
    }


public static void main(String[] args) {
     launch(args);
} 

}