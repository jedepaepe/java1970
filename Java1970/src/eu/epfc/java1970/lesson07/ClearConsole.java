package eu.epfc.java1970.lesson07;

import java.io.IOException;


public class ClearConsole {

    public static void main(String[] args) throws IOException {
        System.out.println("Quelque chose");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
