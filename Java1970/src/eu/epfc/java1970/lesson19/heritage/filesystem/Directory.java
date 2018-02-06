
package eu.epfc.java1970.lesson19.heritage.filesystem;

/**
 *
 * @author jedepaepe
 */
public class Directory extends Node {
    int nrFiles = 0;

    @Override
    public String toString() {
        return "Directory{" + "nrFiles=" + nrFiles + ",nom=" + name + '}';
    }
    
}
