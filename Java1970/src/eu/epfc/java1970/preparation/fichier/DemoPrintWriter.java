/*
 */
package eu.epfc.java1970.preparation.fichier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class DemoPrintWriter {
    
    public static void main(String[] args) throws FileNotFoundException {
        solutionThrow();
        solutionTryCatch();
        solutionTryCatch();
        testScanner();
    }
    
    private static void solutionThrow() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("read_me.txt");
        printWriter.println("Hello PrintWriter // throw version");
        printWriter.println("C'est facile");        
        printWriter.close();
    }
    
    private static void solutionTryCatch() {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("read_me.txt");
            printWriter.println("Hello PrintWriter // try-catch version");
            printWriter.println("C'est facile");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(printWriter != null) printWriter.close();
        }
    }

    private static void solutionTryRessource() {
        try (PrintWriter printWriter = new PrintWriter("read_me.txt")) {
            printWriter.println("Hello PrintWriter // try ressource version");
            printWriter.println("C'est facile");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void testScanner() {
        try (Scanner scanner = new Scanner(new File("read_me.txt"))) {
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
