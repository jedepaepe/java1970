/*
PrintWriter : pour écrire dans fichier (ou autre chose)
 */
package eu.epfc.java1970.lesson28.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 */
public class DemoPrintWriter {

    public static void main(String[] args) throws FileNotFoundException {
        // écrire
        PrintWriter printWriter = new PrintWriter("output.txt");    // instancie un :PrintWriter connecté au fichier "output.txt"
        // le fichier sera créé s'il n'existe pas
        // le contenu du fichier sera écrasé s'il existe
        printWriter.println("Hello printwriter");   // écrire dans le fichier
        printWriter.print("fin");                   // idem
        printWriter.close();                        // fermer le fichier et libérer les ressource du :PrintWriter
        // c'est important, évite que l'écriture ne soit pas terminée

        // lire
        Scanner scanner = new Scanner(new File("output.txt"));  // instancie un :Scanner connecté au fichier "output.txt"
        while (scanner.hasNext()) {         // tant qu'il y a quelque chose dans le fichier
            System.out.println(scanner.nextLine()); // lire une ligne du fichier et l'affiche sur la console
        }
        scanner.close();
    }

}
