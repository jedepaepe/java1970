/*
 */
package eu.epfc.java1970.preparations.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 */
public class NetServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
            while(true) {
                int message = inputFromClient.readInt();
                System.out.println(message);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
