
package eu.epfc.java1970.lesson19.heritage.filesystem;

/**
 *
 * @author jedepaepe
 */
public class Directory extends Node {
    int nrFiles = 0;

    public Directory(String name) {
        // appel du constructeur de la classe mère (constructeur sans paramètre)
        // remplacé par l'appel explicite du constructeur => je décide des paramètres à fournir
        super(name);
        System.out.println("Constructeur de Directory");
    }

    @Override
    public String toString() {
        return "Directory{" + "nrFiles=" + nrFiles + ",nom=" + name + '}';
    }
    
}
