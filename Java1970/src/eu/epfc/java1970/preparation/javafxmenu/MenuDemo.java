/*
Menu demo
base : https://docs.oracle.com/javafx/2/ui_controls/menu_controls.htm
key shortcut : https://blog.idrsolutions.com/2014/04/tutorial-how-to-setup-key-combinations-in-javafx/
key underline selection : http://www.learningaboutelectronics.com/Articles/How-to-add-a-keyboard-shortcut-to-a-menu-in-JavaFX.php
 */
package eu.epfc.java1970.preparation.javafxmenu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author FHA576
 */
public class MenuDemo extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Menu Sample");
        
        MenuItem menuItemAdd = new MenuItem("_Add");
        menuItemAdd.setOnAction((event) -> {
            System.out.println("do add");
        });
        MenuItem menuItemDelete = new MenuItem("_Delete");
        menuItemDelete.setOnAction((event) -> {
            System.out.println("do delete");
        });
        MenuItem menuItemQuit = new MenuItem("_Quit");
        menuItemQuit.setOnAction((event) -> {
            Platform.exit();
        });
        menuItemQuit.setAccelerator(new KeyCodeCombination(KeyCode.Q, KeyCombination.ALT_DOWN));
        Menu menuFile = new Menu("_File");
        menuFile.getItems().addAll(menuItemAdd, menuItemDelete, menuItemQuit);
        
        Menu menuEdit = new Menu("_Edit");
        Menu menuView = new Menu("_View");
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
        
        VBox root = new VBox();
        root.getChildren().add(menuBar);

        Scene scene = new Scene(root, 400, 400, Color.OLDLACE);
        stage.setScene(scene);
        stage.show();
    }
    
}
