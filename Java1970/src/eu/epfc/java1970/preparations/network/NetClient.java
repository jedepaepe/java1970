/*
 */
package eu.epfc.java1970.preparations.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 */
public class NetClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7777);
            DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            while(true) {
                int message = scanner.nextInt();
                outputToClient.writeInt(message);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
