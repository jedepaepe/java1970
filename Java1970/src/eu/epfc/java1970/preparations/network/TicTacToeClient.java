/*
 * Livre Listing 31.10, page 1162
 */
package eu.epfc.java1970.preparations.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Cell;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 */
public class TicTacToeClient extends Application implements TicTacToeConstants {

    private boolean myTurn = false;
    private char myToken = ' ';
    private char otherToken = ' ';
    private Cell[][] cell = new Cell[3][3];
    private Label lblTitle = new Label();
    private Label lblStatus = new Label();
    private int rowSelected;
    private int columnSelected;
    private DataInputStream fromServer;
    private DataOutputStream toServer;
    private boolean continueToPlay = true;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pane.add(cell[i][j] = new Cell(), j, i);    // TODO ?
            }
        }
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(lblTitle);
        borderPane.setCenter(pane);
        borderPane.setBottom(lblStatus);

        Scene scene = new Scene(borderPane, 320, 350);
        primaryStage.setTitle("TicTacToeClient");
        primaryStage.setScene(scene);
        primaryStage.show();

        connectToServer();
    }

    private void connectToServer() {
        try {
            Socket socket = new Socket(host, port);
            fromServer = new DataInputStream(socket.getInputStream());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        new Thread(() -> {
            try {
                int player = fromServer.readInt();

            } catch (IOException ex) {
                Logger.getLogger(TicTacToeClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }
}
