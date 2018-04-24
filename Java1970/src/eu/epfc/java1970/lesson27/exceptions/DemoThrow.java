package eu.epfc.java1970.lesson27.exceptions;

/**
 * Vous pouvez aussi générer des exceptions
 */
public class DemoThrow {

    public static void main(String[] args) {
        boolean check = true;       // pour tromper le compilateur
        if (check) {
            throw new IllegalArgumentException("zut");  // crée et throw une exception => 
                                                        // le programme crashe
        }
        System.out.println("Cette ligne n'est jamais exécuté");
    }

}
